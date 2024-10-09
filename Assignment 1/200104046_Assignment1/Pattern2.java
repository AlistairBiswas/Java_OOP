import java.util.Scanner;

public class Pattern2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        long n, i, j;
        
        System.out.print("Enter the row : ");
        n = input.nextLong();
        
        for (i=n; i>=1; i--)
        {
            for (j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++)
            {
                System.out.print("#");
            }
            System.out.printf("\n");
        }
    }
}
