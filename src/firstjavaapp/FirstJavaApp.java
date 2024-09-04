package firstjavaapp;

import java.util.Scanner;

public class FirstJavaApp {

    public static void main(String[] args) {
      /*  grades grd = new grades();
        grd.getGrade();
        
        Product pr = new Product();
        pr.addProduct(10011, "Soap", 20, 10);
        pr.viewProduct();
        
        Product prl = new Product();
        prl.addProduct(10012, "Cards", 50, 0);
        prl.viewProduct();
        
        
        Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[100];
        
        int nump, i;
        
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        
        double ttp = 0, totalTEP = 0;
        
        for(i=0; i<nump; i++){
            System.out.println("Enter details of Product "+(i+1)+": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double pri = sc.nextDouble();
            System.out.print("Stocks: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Product();
            pr[i].addProduct(id, name, pri, st, sold);
                    
        }
        
        for(i=0; i<nump; i++){
            pr[i].viewProduct();
           
            ttp = ttp + (pr[i].price * pr[i].sold);
            totalTEP = totalTEP + pr[i].price * pr[i].stocks; 
        }
            System.out.println("Total Profit: "+ttp);
            System.out.println("Total TEP: "+totalTEP);
        
    }
    
}*/

        Scanner sc = new Scanner(System.in);
        Account[] ac = new Account[100];
        
        int nump, i;
        System.out.print("Enter no. of Accounts: ");
        nump = sc.nextInt();
        
        for(i = 0; i < nump; i++) {
            System.out.println("Enter Details of Account " + (i + 1) + ": ");
            
            int id;
            boolean sameID;
            do {
                sameID = false;    
                System.out.print("Id: ");
                id = sc.nextInt();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].pid == id) {
                        System.out.println("ID already exists!");
                        sameID = true;
                        break;
                    }
                }
            } while(sameID);
            
            String fn, ln, eml, un, pw;
            boolean sameUsername, sameEmail;
            
            System.out.print("Firstname: ");
            fn = sc.next();
            
            System.out.print("Lastname: ");
            ln = sc.next();
            
            do {
                sameEmail = false;
                System.out.print("Email: ");
                eml = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].email.equals(eml)) {
                        System.out.println("Email already exists!");
                        sameEmail = true;
                        break;
                    }
                }
            } while(sameEmail);
            
            do {
                sameUsername = false;
                System.out.print("Username: ");
                un = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].username.equals(un)) {
                        System.out.println("Username already exists!");
                        sameUsername = true;
                        break;
                    }
                }
            } while(sameUsername);
        do {
                System.out.print("Password: ");
                pw = sc.next();
                if (!Account.isPasswordValid(pw)) {
                    System.out.println("Invalid Password, Please Enter Again: ");
                }
        }while (!Account.isPasswordValid(pw));
            
            ac[i] = new Account();
            ac[i].addAccount(id, fn, ln, eml, un, pw);
        }
        
        for(i = 0; i < nump; i++) {
        ac[i].viewAccount();   

        }

    } 
}