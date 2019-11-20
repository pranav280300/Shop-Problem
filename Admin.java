import java.io.*;
import java.util.*;


class Admin{

    static void add(){

        Scanner scan = new Scanner(System.in);

        /*try{
            PrintWriter pr = new PrintWriter("Grocery.txt");
            PrintWriter pr1 = new PrintWriter("Grooming.txt");
            PrintWriter pr2 = new PrintWriter("Beverages.txt");
            pr.print("");
            pr1.print("");
            pr2.print("");
            pr.close();
            pr1.close();
            pr2.close();

        }catch(Exception e){}*/
        System.out.print("Enter Department: ");
        String dept = scan.next();
        System.out.print("Enter Id you want to add: ");
        int ad = scan.nextInt();
        System.out.print("Enter quantity: ");
        int quan = scan.nextInt();
        System.out.println("Quantity "+quan+" added to ID "+ad+" of "+dept+" section.\n");
        scan.close();
        System.exit(0);

    }

    
    static void admin(){
        String strLine;
        Scanner scan = new Scanner(System.in);
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
            System.out.println("Do you want to edit?\n(Yes=>1)");
            int up = scan.nextInt();
            if(up==1){
                Admin.add();
            }
            else{
                System.out.println("Thank You...");
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("<<<<<<EXITING>>>>>");
                try{Thread.sleep(1000);}catch(Exception e){}
                System.exit(0);
            }
        
            
        }catch(Exception e){}
        scan.close();
    }
}