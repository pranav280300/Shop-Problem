const advancedResults=(model,populate)=>async(req,res,next)=>{
    let query;
    //Copy req.query
    const reqQuery={...req.query}
    //Feild to exclude
    const removeFeilds=['select','sort','page','limit'];
    //Loop over removeReild and delete the, from reqQuery
    removeFeilds.forEach(params=> delete reqQuery[params]);

    let queryStr=JSON.stringify(reqQuery);
    //Create operators
    queryStr=queryStr.replace(/\b(gt|gte|lt|lte|in)\b/g,match=>`$${match}`);
    //Finding resource
    query=model.find(JSON.parse(queryStr));
    //Select Feilds
    if(req.query.select){
        const fields=req.query.select.split(',').join(' ');
        query=query.select(fields);
    }
    //sort
    if(req.query.sort){
        const sortBy=req.query.sort.split(',').join(' ');
        query=query.sort(sortBy);
    }else{
        query=query.sort('-createdAt');
    }
    //pagination
    const page=parseInt(req.query.page,10)||1;
    const limit=parseInt(req.query.limit,10) || 10;
    const startindex=(page-1)*limit;
    const endindex=page*limit;
    const total= await model.countDocuments();
    query=query.skip(startindex).limit(limit);
    if(populate){
        query=query.populate(populate);
    }
    //Executing query
    const results=await query;
    //pagination result
    const pagination={};
    if(endindex<total){
        pagination.next={
            page:page+1,
            limit
        }
    }
    if(startindex>0){
        pagination.prev={
            page:page-1,
            limit
        }
    }
    res.advancedResults={
        success:true,
        count:results.length,
        pagination,
        data:results
    }
    next();
};
module.exports=advancedResults
