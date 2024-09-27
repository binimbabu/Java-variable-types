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
