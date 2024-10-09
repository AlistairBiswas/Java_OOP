
package bankaccount;

public class Account {
    
    int accountID;
    double balance;
    String transactionType;
    
    Account (){
        
        accountID = 0;
        balance = -1.0;
        transactionType = "null";
    }
    Account (int accId, double blnc, String tType){
        
        accountID = accId;
        balance = blnc;
        transactionType = tType;  
    }
    
    public double changeBalance(double x){
        
        if ("debit".equals(transactionType)){
            
            return (balance - x);
        }
        else if ("credit".equals(transactionType)){
            
            return (balance + x);
        }
        else {
            
            return balance;
        }
    }
}
