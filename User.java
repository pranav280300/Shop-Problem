import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


class User{

    
    static void user(){
        //Groc frog = new Groc();

        Scanner scan = new Scanner(System.in);

       
        System.out.println("Welcome to the Shop");
        double amt = 0.0;
        String strLine;
        try{
            FileInputStream fi = new FileInputStream("Grocery.txt");
            FileInputStream fi1 = new FileInputStream("Grooming.txt");
            FileInputStream fi2 = new FileInputStream("Beverages.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fi));
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(fi1));
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(fi2));
            
            while((strLine = reader.readLine()) != null)
            {
                System.out.println(strLine);
            }
            while((strLine = reader1.readLine()) != null)
            {
                System.out.println(strLine);
            }
            while((strLine = reader2.readLine()) != null)
            {
                System.out.println(strLine);
            }
            reader.close();
            reader1.close();
            reader2.close();
        }catch(Exception e){}

        System.out.print("Enter Department: \n(Grocery=>1 | Grooming=>2 | Beverage=>3 )");
        int ch = scan.nextInt();

        System.out.print("Enter Id: ");
        int ids = scan.nextInt();

        System.out.print("Enter quantity: ");
        int quan = scan.nextInt();

        try{
            if(quan>20){
                throw new ExceedException("Quantity for 1 person can't exceed 20!\nPlease try again.");
            }
        }catch(ExceedException e){System.out.println(e);}

        

        if(ch==1){
            int random = ThreadLocalRandom.current().nextInt();
            String rando = "Bill Id: "+random+"\n";
            String det = "-------------------------------------------------------------------------------------------------\n";
            String itemid = "Item id: "+ids+"\n";
            String price = "";
            String amts = "";
            String quants = "Quantity purchased: "+quan+"\n";
            String names = "";
            if(ids == 101){
                amt = amt + quan*100.00;
                price = "Price: "+100+"\n";
                amts = "Amount( "+quan+" X "+100+" ): "+amt+"\n";
                names = "Item name: Soap\n";
            }
            if(ids == 102){
                amt = amt + quan*120.00;
                price = "Price: "+120+"\n";
                amts = "Amount( "+quan+" X "+120+" ): "+amt+"\n";
                names = "Item name: Comb\n";
            }
            if(ids == 103){
                amt = amt + quan*140.00;
                price = "Price: "+140+"\n";
                amts = "Amount( "+quan+" X "+140+" ): "+amt+"\n";
                names = "Item name: Shampoo\n";
            }
            if(ids == 104){
                amt = amt + quan*160.00;
                price = "Price: "+160+"\n";
                amts = "Amount( "+quan+" X "+160+" ): "+amt+"\n";
                names = "Item name: Perfume\n";
            }
            if(ids == 105){
                amt = amt + quan*180.00;
                price = "Price: "+180+"\n";
                amts = "Amount( "+quan+" X "+180+" ): "+amt+"\n";
                names = "Item name: Lotion\n";
            }
            System.out.println("Generating Bill....");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            try{
                FileOutputStream fout = new FileOutputStream("Users.txt", true);
                for(int r=0; r<det.length(); r++){
                    fout.write(det.charAt(r));
                }
                for(int r=0; r<rando.length(); r++){
                    fout.write(rando.charAt(r));
                }
                for(int r=0; r<itemid.length(); r++){
                    fout.write(itemid.charAt(r));
                }
                for(int r=0; r<names.length(); r++){
                    fout.write(names.charAt(r));
                }
                for(int r=0; r<price.length(); r++){
                    fout.write(price.charAt(r));
                }
                for(int r=0; r<amts.length(); r++){
                    fout.write(amts.charAt(r));
                }
                for(int r=0; r<quants.length(); r++){
                    fout.write(quants.charAt(r));
                }
                
                fout.close();
                System.out.println("Bill Generated in Users.txt\n");
            }catch(Exception e){}
        }
        else if(ch==2){
            int random = ThreadLocalRandom.current().nextInt();
            String rando = "Bill Id: "+random+"\n";
            String det = "-------------------------------------------------------------------------------------------------\n";
            String itemid = "Item id: "+ids+"\n";
            String price = "";
            String amts = "";
            String quants = "Quantity purchased: "+quan+"\n";
            String names = "";
            if(ids == 101){
                amt = amt + quan*100.00;
                price = "Price: "+100+"\n";
                amts = "Amount( "+quan+" X "+100+" ): "+amt+"\n";
                names = "Item name: Soap\n";
            }
            if(ids == 102){
                amt = amt + quan*120.00;
                price = "Price: "+120+"\n";
                amts = "Amount( "+quan+" X "+120+" ): "+amt+"\n";
                names = "Item name: Comb\n";
            }
            if(ids == 103){
                amt = amt + quan*140.00;
                price = "Price: "+140+"\n";
                amts = "Amount( "+quan+" X "+140+" ): "+amt+"\n";
                names = "Item name: Shampoo\n";
            }
            if(ids == 104){
                amt = amt + quan*160.00;
                price = "Price: "+160+"\n";
                amts = "Amount( "+quan+" X "+160+" ): "+amt+"\n";
                names = "Item name: Perfume\n";
            }
            if(ids == 105){
                amt = amt + quan*180.00;
                price = "Price: "+180+"\n";
                amts = "Amount( "+quan+" X "+180+" ): "+amt+"\n";
                names = "Item name: Lotion\n";
            }
            System.out.println("Generating Bill....");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            try{
                FileOutputStream fout = new FileOutputStream("Users.txt", true);
                for(int r=0; r<det.length(); r++){
                    fout.write(det.charAt(r));
                }
                for(int r=0; r<rando.length(); r++){
                    fout.write(rando.charAt(r));
                }
                for(int r=0; r<itemid.length(); r++){
                    fout.write(itemid.charAt(r));
                }
                for(int r=0; r<names.length(); r++){
                    fout.write(names.charAt(r));
                }
                for(int r=0; r<price.length(); r++){
                    fout.write(price.charAt(r));
                }
                for(int r=0; r<amts.length(); r++){
                    fout.write(amts.charAt(r));
                }
                for(int r=0; r<quants.length(); r++){
                    fout.write(quants.charAt(r));
                }
                System.out.println("Bill Generated in Users.txt\n");
                fout.close();
            }catch(Exception e){}
        }
        else if(ch==3){
            int random = ThreadLocalRandom.current().nextInt();
            String rando = "Bill Id: "+random+"\n";
            String det = "-------------------------------------------------------------------------------------------------\n";
            String itemid = "Item id: "+ids+"\n";
            String price = "";
            String amts = "";
            String quants = "Quantity purchased: "+quan+"\n";
            String names = "";
            if(ids == 101){
                amt = amt + quan*100.00;
                price = "Price: "+100+"\n";
                amts = "Amount( "+quan+" X "+100+" ): "+amt+"\n";
                names = "Item name: Juice\n";
            }
            if(ids == 102){
                amt = amt + quan*120.00;
                price = "Price: "+120+"\n";
                amts = "Amount( "+quan+" X "+120+" ): "+amt+"\n";
                names = "Item name: SoftDrink\n";
            }
            if(ids == 103){
                amt = amt + quan*140.00;
                price = "Price: "+140+"\n";
                amts = "Amount( "+quan+" X "+140+" ): "+amt+"\n";
                names = "Item name: Flavoured Milk\n";
            }
            if(ids == 104){
                amt = amt + quan*160.00;
                price = "Price: "+160+"\n";
                amts = "Amount( "+quan+" X "+160+" ): "+amt+"\n";
                names = "Item name: Energy Drink\n";
            }
            if(ids == 105){
                amt = amt + quan*180.00;
                price = "Price: "+180+"\n";
                amts = "Amount( "+quan+" X "+180+" ): "+amt+"\n";
                names = "Item name: Protien Milk\n";
            }
            System.out.println("Generating Bill....");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            try{
                FileOutputStream fout = new FileOutputStream("Users.txt", true);
                for(int r=0; r<det.length(); r++){
                    fout.write(det.charAt(r));
                }
                for(int r=0; r<rando.length(); r++){
                    fout.write(rando.charAt(r));
                }
                for(int r=0; r<itemid.length(); r++){
                    fout.write(itemid.charAt(r));
                }
                for(int r=0; r<names.length(); r++){
                    fout.write(names.charAt(r));
                }
                for(int r=0; r<price.length(); r++){
                    fout.write(price.charAt(r));
                }
                for(int r=0; r<amts.length(); r++){
                    fout.write(amts.charAt(r));
                }
                for(int r=0; r<quants.length(); r++){
                    fout.write(quants.charAt(r));
                }
                System.out.println("Bill Generated in Users.txt\n");
                fout.close();
            }catch(Exception e){}
        }
        scan.close();
    }
}