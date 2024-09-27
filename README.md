Java variable types



package variableTypes;

public class BankAccount {
    static String bankName="ICICI Bank";
    String accountNumber;
    String accountHoldersName;
    Float balance;
    
	public static void main(String[] args) {
     double interestRate = 5.5;
     System.out.println(interestRate);
     BankAccount bankAccount = new BankAccount();
     bankAccount.accountHoldersName="bini";
     bankAccount.accountNumber="123456";
     bankAccount.balance=2000.00f;
     System.out.println(bankAccount.balance);
	}

}



'bankName' is static and static variable (here 'bankName') are available throughout the class BankAccount by calling BankAccount.bankName with value 'ICICI Bank'. Static variables are allocated in Method area in the memory.

accountNumber,  accountHoldersName, balance are non-static variables, hence can be accessed only by creating an instance of the class (i.e BankAccount bankAccount = new BankAccount(); ) and calling the variable instance with the dot operator (i.e bankAccount.accountHoldersName="bini"; '). Non-Static variables are allocated in Heap area in the memory.


'interestRate' variable type is available inside the main function since it is a local variable, whenever you create a local variable in the method you are supposed to initialize if you want to print before assignment. Access specifier (i.e public, private, protected) cannot be introduced in local variable, but access specifier can be used in global variable. Local variables are allocated in Stack area of the memory. 
