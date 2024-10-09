import java.util.Scanner;

public class HarmonicSeries {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        long n;
        double i, sum1=0, sum2=0;
        
        System.out.print("Enter the value of n : ");
        n = input.nextLong();
        
        for (i=1; i<=n; i++)
        {
            sum1 = sum1 + 1/i;
        }
        for (i=n; i>=1; i--)
        {
            sum2 = sum2 + 1/i;
        }
        
        System.out.printf("Sum of the series (Left to Right) : %f\n", sum1);
        System.out.printf("Sum of the series (Right to Left) : %f\n", sum2);
        
        double diff = sum1-sum2;
        
        double absolute = Math.abs(diff);
        System.out.println("Absolute Difference : "+absolute);
    }
}
