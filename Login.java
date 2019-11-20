import java.io.*;
import java.util.*;

class Login{
    static void login(){

        Scanner scan = new Scanner(System.in);
        //int suc = 0;

        System.out.print("------LOGIN-----\n");
        System.out.print("Login id: ");
        String user = scan.next();
        System.out.print("Password: ");
        String pass = scan.next();

        String users = "Login id: "+user+" ";
        String passes = "Pass: "+pass+" ";

        String line;
        BufferedReader reader;

        try{
            //FileInputStream fin = new FileInputStream("Admin.txt", true);
            reader = new BufferedReader(new FileReader("Admin.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line.contains(users));
                System.out.println(line.contains(passes));
                if((line.contains(users)) && (line.contains(passes))){
                    System.out.println("Login Succesful");
                    System.out.println("Entering DataBase...");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    Admin.admin();
                }
                else{
                    System.out.println("User doesn't exist");
                }
                
            }

        }catch(Exception e){}

        scan.close();
    }
}