import java.io.*;
import java.util.*;


class Shop{


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        User u = new User();
        
        
        Data.database();

        System.out.println("--------------------WELCOME------------------");
        System.out.println("1. CUSTOMER PORTAL");
        System.out.println("2. ADMIN PORTAL");
        System.out.print("Enter your destination: ");
        int choice = scan.nextInt();
        if(choice == 2){
            System.out.println("Entering Login Portal......");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            Login.login();
        }
        else if(choice==1){
            System.out.println("Wait While the Items are Loading...");
            try{Thread.sleep(1000);}catch(Exception e){}
            u.user();
        }
        scan.close();
        //g.write();
    }
}