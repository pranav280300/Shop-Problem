import java.io.*;

class Data{
    
    

    static void database(){
        Groc groc[] = new Groc[5];
        Groom groom[] = new Groom[5];
        Bev bev[] = new Bev[5];

        //Groc frog = new Groc();
        

        try{
            PrintWriter pr = new PrintWriter("Grocery.txt");
            PrintWriter pr1 = new PrintWriter("Grooming.txt");
            PrintWriter pr2 = new PrintWriter("Beverages.txt");
            pr.print("");
            pr1.print("");
            pr2.print("");
            pr.close();
            pr1.close();
            pr2.close();

        }catch(Exception e){}

        String det = "-------------------------------------------------------------GROCERY-------------------------------------------------------------------------------------------------\n";

        try{
            FileOutputStream fout = new FileOutputStream("Grocery.txt", true);
            for(int i=0; i<det.length(); i++){
                fout.write(det.charAt(i));
            }
            fout.close();
        }catch(Exception e){}
        
        
        groc[0] = new Groc(101, "Bread         ", 100.00, 100);
        groc[1] = new Groc(102, "Butter        ", 120.00, 100);
        groc[2] = new Groc(103, "Jam           ", 140.00, 100);
        groc[3] = new Groc(104, "Milk          ", 160.00, 100);
        groc[4] = new Groc(105, "Eggs          ", 180.00, 100);
        
        

        String det1 = "-------------------------------------------------------------GROOMING-------------------------------------------------------------------------------------------------\n";

        try{
            FileOutputStream fout = new FileOutputStream("Grooming.txt", true);
            for(int i=0; i<det1.length(); i++){
                fout.write(det1.charAt(i));
            }
            fout.close();
        }catch(Exception e){}

        groom[0] = new Groom(101, "Soap          ", 100.00, 100);
        groom[1] = new Groom(102, "Comb          ", 120.00, 100);
        groom[2] = new Groom(103, "Shampoo       ", 140.00, 100);
        groom[3] = new Groom(104, "Perfume       ", 160.00, 100);
        groom[4] = new Groom(105, "Lotion        ", 180.00, 100);

        String det2 = "-------------------------------------------------------------BEVERAGES-------------------------------------------------------------------------------------------------\n";

        try{
            FileOutputStream fout = new FileOutputStream("Beverages.txt", true);
            for(int i=0; i<det2.length(); i++){
                fout.write(det2.charAt(i));
            }
            fout.close();
        }catch(Exception e){}

        bev[0] = new Bev(101, "Juice         ", 100.00, 100);
        bev[1] = new Bev(102, "SoftDrinks    ", 120.00, 100);
        bev[2] = new Bev(103, "Flavoured Milk", 140.00, 100);
        bev[3] = new Bev(104, "Energy Drinks ", 160.00, 100);
        bev[4] = new Bev(105, "Protien Milk  ", 180.00, 100);

    }



}