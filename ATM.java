import java.util.Scanner;
public class ATM {
     public static void main(String[] args) {
        int balance = 200000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println(" CHOOSE 1 FOR WITHDRAW");
            System.out.println(" CHOOSE 2 FOR DEPOSIT");
            System.out.println(" CHOOSE 3 FOR CHECK BALANCE");
            System.out.println(" CHOOSE 4 FOR EXIT");
            System.out.print(" CHOOSE THE OPERATION YOU WANT TO PERFROM : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the amount to be withdraw : ");
                withdraw = sc.nextInt();
                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("Please collect your amount.");
                }
                else {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("---------------------------------------------");
                break;
                case 2:
                System.out.println("Enter the amount to be deposited : ");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your amount has been successfully deposited");
                System.out.println("----------------------------------------------");
                break;
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("-----------------------------------------------");
                break;
                case 4:
                System.exit(0);
            }
        }
    }       
}   

