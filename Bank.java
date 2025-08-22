import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = sc.nextLine();
        System.out.print("Enter the AGE:");
        int age = sc.nextInt();
        System.out.println("Enter your Gender \n 1.Male \n 2.Female:");
        int gender=sc.nextInt();
        switch(gender){
            case 1:
            System.out.println("male");
            break;
            case 2:
            System.out.println("Female");  
            break;
            default:
            System.out.println("other");
            break;
        }
        System.out.print("Enter your Account Balance:");
        float Balance=sc.nextFloat();
        System.out.println("\n 1.Account Withdrawal \n 2. Amount Deposite \n 3. Loan");
        int operationChoice = sc.nextInt() ;
        switch (operationChoice) { 
            case 1:
                System.out.println("Welcome to Account Withdrawal");
                System.out.println("insert your card inside: "); 
                System.out.println("Choose your language:");
                System.out.println("\n 1.Telugu  \n 2. English \n 3. Hindi");
                int lang=sc.nextInt();
                switch (lang){
                    case 1:
                    System.out.println("Language selected sucessfully in Telugu");
                    break;
                    case 2:
                    System.out.println("Language selected sucessfully in English");
                    break;
                    case 3:
                    System.out.println("Language selected sucessfully in Hindi");
                    break;
                    default:
                    System.out.println("Select The language only from Given Menue ");
                    break;

                }
                System.out.println("Enter your Amount :");
              int cash=sc.nextInt(); 
int pin =0000 ; 
System.out.print("Enter password :"); 
int pass=sc.nextInt(); 
if(pin == pass){ 
    System.out.println("Entered pin is correct "); 
}else{ 
    System.out.println("Entered pin is incorrect "); 
}
System.out.println("Collect your cash : " + cash); 
System.out.println("Your remaining balance is : " + (Balance - cash));
System.out.println("Thank you for using our services"); 
                break;
            case 2:
                System.out.println("Welcome to Amount Deposit");
                System.out.println("insert your card inside: "); 
                System.out.println("Choose your language:");
                System.out.println("\n 1.Telugu  \n 2. English \n 3. Hindi");
                int lang1 =sc.nextInt();
                switch (lang1){
                    case 1:
                    System.out.println("Language selected sucessfully in Telugu");
                    break;
                    case 2:
                    System.out.println("Language selected sucessfully in English");
                    break;
                    case 3:
                    System.out.println("Language selected sucessfully in Hindi");
                    break;
                    default:
                    System.out.println("Select The language only from Given Menue ");
                    break;

                }      
                System.out.println("Enter the Amount to be Deposited:");
                int dep=sc.nextInt();
int pin1 = 0000; 
System.out.print("Enter password :"); 
int pass1=sc.nextInt(); 
if(pin1 == pass1){ 
    System.out.println("Entered pin is correct "); 
}else{ 
    System.out.println("Entered pin is incorrect "); 
}
System.out.println("Cash Have Been Deposited Successfully"); 
System.out.println("Your New Balance is : " + (Balance + dep));
System.out.println("Thank you for using our services"); 
                break;
            case 3:             
    System.out.println("Welcome to Loan");
    System.out.println("Insert your card inside: "); 
    System.out.println("Choose your language:");
    System.out.println("\n 1.Telugu  \n 2. English \n 3. Hindi");
    int lang2 = sc.nextInt();
    switch (lang2){
        case 1:
            System.out.println("Language selected sucessfully in Telugu");
            break;
        case 2:
            System.out.println("Language selected sucessfully in English");
            break;
        case 3:
            System.out.println("Language selected sucessfully in Hindi");
            break;
        default:
            System.out.println("Select The language only from Given Menue ");
            break;
    }
    System.out.println("Enter Loan Amount you want:");
    float loanAmount = sc.nextFloat();
    System.out.println("Select Loan Type: ");
    System.out.println("1. Personal Loan \n2. Home Loan \n3. Education Loan");
    int loanType = sc.nextInt();
    switch(loanType){
        case 1:
            System.out.println("You selected Personal Loan");
            break;
        case 2:
            System.out.println("You selected Home Loan");
            break;
        case 3:
            System.out.println("You selected Education Loan");
            break;
        default:
            System.out.println("Invalid Loan Type, continuing with Personal Loan.");
            break;
    }
    int pin2 = 0000; 
    System.out.print("Enter password :"); 
    int pass2 = sc.nextInt(); 
    if(pin2 == pass2){ 
        System.out.println("Entered pin is correct "); 
    }else{ 
        System.out.println("Entered pin is incorrect, Loan cannot be processed."); 
        break;
    }
    float processingCharge = loanAmount * 0.02f;
    float creditedAmount = loanAmount - processingCharge;
    Balance += creditedAmount;
    System.out.println("Loan Approved Successfully!");
    System.out.println("Loan Amount Requested: " + loanAmount);
    System.out.println("Processing Charges (2%): " + processingCharge);
    System.out.println("Amount Credited to Your Account: " + creditedAmount);
    System.out.println("Your Updated Balance is : " + Balance);
    System.out.println("Thank you for using our services"); 
    break;
            default:
                System.out.println("Invalid choice. Please enter only given menue");
                break; 
        }
        sc.close();
    }
}
