import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        bankdetails bk = new bankdetails();
        int operator;
        
        try (Scanner input = new Scanner(System.in)) {

            for(int i=1;i<10;i++){     
                System.out.println("--------******-------");
                System.out.println("Welcome to the Bank");
                System.out.println("Choose the nuber form below list options");
                System.out.println("1. Open Bank Account");
                System.out.println("2. Show Bank Details");
                System.out.println("3. Deposite");
                System.out.println("4. Withdrow");
                System.out.println("5. Fixed Deposite");
                operator = input.nextInt();
            
            
                switch (operator){
                    case 1:
                     bk.openAccount();
                     break; 
   
                    case 2:
                    bk.showDetails();
                     break;
   
                    case 3:
                     bk.depositeAmount();
                     break;
   
                    case 4:
                     bk.withdrawAmount();
                     break;
   
                    case 5:
                     bk.fixedDeposite();
                     break;
   
                    default:
                     System.out.println("Invalid Operation");
                     break;
                }
               
              }
        }      
    }
}

class bankdetails{
    String ACNumber;
    String Name;
    int Age;
    float Balance = 0;
    int totalFD;
    Scanner sc = new Scanner(System.in);

    void openAccount(){
        System.out.println("Enter Your Name: ");
        Name = sc.next();
        System.out.println("Enter Your Age: ");
        Age = sc.nextInt();
        System.out.println("Opening Account with 0 balance");
    }

    void showDetails(){
        System.out.println("Name of the Account holder: " + Name );
        System.out.println("Age of Account Holder: "+ Age);
        System.out.println("Total balance in Account: "+ Balance);
        System.out.println("The Total number of Fixed Deposite you have made is: "+ totalFD);
    }

    void depositeAmount(){
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        Balance = Balance + amt;
        System.out.println("The Amount "+ amt + "is added to your Account and now your Total balance is "+ Balance);  
    }

    void withdrawAmount(){
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (Balance >= amt) {  
            Balance = Balance - amt;  
            System.out.println("Balance after withdrawal: " + Balance); 
            System.out.println("The Amount "+ amt + " is withdraw from your account and now your Total balance is "+ Balance); 
        } 
        else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed." );  
        } 
    }


    void fixedDeposite(){
        long amts;
        int time;

        System.out.println("Welcome to FD Section");
        System.out.println("We are providing 3% Intrest for the age til 30 years FD plan, 5% Intrest for age above 30 and blow 70 FD Plan and 12% Intrest for age more than 70 FD Plan");
        
        System.out.println("For how long would you like to put your money for Fixed Deposite (Eg. - 6 Months,  12 months, 60 Months)");
        time = sc.nextInt();
        if(time == 6 || time == 12 || time == 60 ){
            System.out.println("Moving to further Process");
        
        }
        else{
            System.out.println("Enter the Time frame as 6 monts, 12 months or 60 months: ");
            time = sc.nextInt();
        }       
        
        

        System.out.println("Enter the amount you want to Make Fixed Deposite: ");
        amts = sc.nextLong();

        
        if(Balance > amts){
            float intrestEarn = intrest(amts, time, Age);
            Balance = Balance - amts;
            System.out.println("Your current balance is"+ Balance);
            System.out.println("You have invested "+ amts + " Money in Fixed Deposite any you will earn "+ intrestEarn + Balance);
            totalFD++;          
        }
        else {  
            System.out.println("Your balance is less than " + amts + "\tFixed Deposite can not be made." );  
        }
    }



    float intrest(long amts, int time, int age){
        float intrest=0;
        int rate;

        if (age < 30){
            rate = 2;
            intrest = (amts * time * rate)/100;
        }
        else if(age >= 30 && age <= 70){  
            rate = 5;
            intrest = (amts * time * rate)/100; 
        }
        else if(age > 70){
            rate = 12;
            intrest = (amts * time * rate)/100;
        }
        else{
            System.out.println("Something went Wrong Try again");
        }
        
        return intrest;
    }
       

}