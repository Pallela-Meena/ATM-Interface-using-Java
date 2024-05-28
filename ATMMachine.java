import java.util.*;

class ATM{
    float Balance;
    int PIN=1234;
    Scanner sc = new Scanner(System.in);
    public void checkPin(){
        System.out.println("Enter your PIN");
        int enteredPin = sc.nextInt();
        if(enteredPin==PIN){
            menu();
        }
        else{
            System.out.println("*** Enter valid PIN ***");
        }
    }

    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. EXIT");
        System.out.print("Enter Here: ");
        
        int choice = sc.nextInt();
        if(choice==1){
            checkBalance();
        }else if(choice==2){
            withdrawlAmount();
        }else if(choice==3){
            depositAmount();
        }else if(choice==4){
            System.out.print("Thank You!!!");
            return;
        }else{
            System.out.println("Enter valid choice");
        }
        
    }

    public void checkBalance(){
        System.out.println("---------------------------------------------");
        System.out.println("Your Current Balance is: "+Balance+" Rupees ");
        System.out.println("---------------------------------------------");
        menu();
    }

    public void withdrawlAmount(){
        System.out.print("Enter Withdrawl Amount: ");
        int wAmount = sc.nextInt();
        if(wAmount>Balance){
            System.out.println("---------------------------------------------");
            System.out.println("*** Insufficient Account Balance ***");
            System.out.println("---------------------------------------------");
        }else{
            Balance=Balance-wAmount;
            System.out.println("---------------------------------------------");
            System.out.println("*** Amount Withdrawl Successful! ***");
            System.out.println("---------------------------------------------");
        }
        
        menu();
    }

    public void depositAmount(){
        System.out.print("Enter Deposit Amount: ");
        int dAmount = sc.nextInt();
        Balance = Balance+dAmount;
        System.out.println("---------------------------------------------");
        System.out.println("*** Amount Deposited Successfully! ***");
        System.out.println("---------------------------------------------");
        menu();

    }
}

class ATMMachine{
    public static void main(String args[]){
        ATM obj = new ATM();
        obj.checkPin();
    }
}