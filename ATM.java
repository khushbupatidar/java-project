//import reqired classes and packages
import java.util.Scanner;

//create ATMExample class to implement the ATM functionlly
public class ATM
{
    //main method satrts
    public static void main(String[] args) throws Exception                                                      
    {
        // declare  and initialise balance withdraw, and deposite
        int balance = 100000, withdraw, deposit, savedPin = 12345;
       
        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated Teller MAchine");
            System.out.println("enter your pin");
           
            int pin = sc.nextInt();
            if(pin != savedPin)
            {
                System.out.println("Wrong pin, Please enter the correct pin");
                break;
            }
            else
            {
                System.out.println("Choose 1 for withdrawl");
                System.out.println("Choose 2 for deposite");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for Exit");
                System.out.println("Choose the operation you want to perform");

                //get choice from user
                int choice= sc.nextInt();
                switch(choice)
                {
                    case 1 :
                            System.out.println("enter money to be withdraw");

                            //get the withdrawl entry from user
                            withdraw = sc.nextInt();

                            //check whether the balance is greater than or euqal to the withdrawl amount
                            if(balance >= withdraw)
                            {
                                //remove the withdrawl amount from the total balance
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                            }
                            else
                            {
                                //show custom error message
                                System.out.println("Insufficient balance");
                            }
                            System.out.println("");
                            break;

                    case 2 :
                            System.out.println("enter money to be diposited");

                            //get the deposite amount from user
                            deposit = sc.nextInt();

                            //add the deposit amount to the total balance
                            balance = balance + deposit;
                            System.out.println("your money has been successflly deposited");

                            System.out.println("");
                            break;

                    case 3 :
                            //displaying the total balance of the user
                            System.out.println("Balance :"+ balance);

                            System.out.println("");
                            break;
                    case 4 :
                            //exit from the menu
                            System.exit(0);
                }
            }
        }
        sc.close();
    }
}