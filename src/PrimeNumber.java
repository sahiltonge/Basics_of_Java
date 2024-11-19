import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        double n= sc.nextDouble();
        boolean isprime=true;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isprime=false;
                break;
            }
        }
        if(isprime)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
