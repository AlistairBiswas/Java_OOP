
package bankaccount;

public class BankAccount {

    public static void main(String[] args) {
        
        Account account1 = new Account (1001, 5000.0, "debit");
        
        System.out.println("Account ID is : "+account1.accountID);
        System.out.println("Original Balance : "+account1.balance);
        System.out.println("Transaction Type : "+account1.transactionType);
        System.out.println("Changed Balance : "+account1.changeBalance(50));
    }
    
}
