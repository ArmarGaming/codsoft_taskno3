//TASK 3
//ATM INTERFACE
import java.util.*;
class ech
{
    float bal;

    public void menu() 
    {
        try 
        {
            System.out.println(":::::WELCOME TO JAVA ATM SYSTEM:::::");
            System.out.println(" 1: FOR CHECK BALANCE \n" +
                    " 2: FOR WITHDREAWAL \n" +
                    " 3: FOR DEPOSITE\n" +
                    " 4: FOR EXIT");
            System.out.println("Enter Number to slected");
            Scanner se = new Scanner(System.in);
            int sel;
            sel = se.nextInt();
            if (sel == 1) {
                checkbal();
            } else if (sel == 2) {
                withdraw();
            } else if (sel == 3) {
                deposite();
            } else if (sel == 4) {
                return;
            } else {
                System.out.println("Enter a valid choose");
            }
        }
         catch (Exception e) {
            System.out.println("Only Enter Numaric Value");
        }
    }

    public void checkbal() {
        System.out.println("Your Account Balace is : " + bal);
        menu();
    }

    public void withdraw() {
        try {
            System.out.println("Enter ammount of withdraw : ");
            Scanner sc = new Scanner(System.in);
            int wa;
            wa = sc.nextInt();
            if (bal > wa) {
                bal = bal - wa;
                System.out.println("Successfull Transaction");
            } else {
                System.out.println("Insuffinse balance...");
                withdraw();
            }
        } catch (Exception e) {
            System.out.println("Only Enter Numaric Value");
        }
        menu();
    }

    public void deposite() {
        try {
            System.out.println("Enter the deposite ammount: ");
            Scanner sc = new Scanner(System.in);
            int da;
            da = sc.nextInt();
            bal = bal + da;
            System.out.println("Successfull Transaction");
        } catch (Exception e) {
            System.out.println("Only Enter Numaric Value");
        }
        menu();
    }
}

class atmmech {
    public static void main(String args[]) {
        ech at = new ech();
        at.menu();
    }
}