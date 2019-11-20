import java.io.*;


public class Bev{

    int quantity;
    double price;
    int id;
    String name;

    Bev(int id, String name, double price, int quantity){
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;

        String ids = "Item ID: "+id+" ";
        String names = "Item Name: "+name+" ";
        String prices = "Item Price: "+price+" ";
        String quantitys = "Quantity left: "+quantity+"\n";
        
        
        try{
            FileOutputStream fout = new FileOutputStream("Beverages.txt", true);
            for (int i=0; i<ids.length(); i++){
                fout.write(ids.charAt(i));
            }
            for (int i=0; i<names.length(); i++){
                fout.write(names.charAt(i));
            }
            for (int i=0; i<prices.length(); i++){
                fout.write(prices.charAt(i));
            }
            for (int i=0; i<quantitys.length(); i++){
                fout.write(quantitys.charAt(i));
            }
            fout.close();
        }catch(Exception e){}

    }
    

}