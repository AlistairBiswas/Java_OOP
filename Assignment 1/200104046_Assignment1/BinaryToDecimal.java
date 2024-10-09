import java.util.Scanner;

public class BinaryToDecimal {
    
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Binary string: ");
        String a=input.next();
        
        int flag=0,i;
        
        for(i=0;i<a.length();i++)
        {
            if(a.charAt(i)!='1' && a.charAt(i)!='0')
            {
                flag=1;
                break;
            }
        }
        
         if(flag==1)
            System.out.println("error: invalid binary string "+a);
        else
        {
            int d=Integer.parseInt(a, 2);
        System.out.println("The equivalent decimal number for binary "+a+" is: "+d);
        }    
    }
}
