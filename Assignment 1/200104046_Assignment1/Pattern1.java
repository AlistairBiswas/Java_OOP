import java.util.Scanner;

public class Pattern1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        long n, i, j;
        
        System.out.print("Enter the row : ");
        n = input.nextLong();
        
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print("#");
            }
            System.out.printf("\n");
        }
    }
}
