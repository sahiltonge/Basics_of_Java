import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Factorial Number:");
        int fn=sc.nextInt();
        System.out.print("Enter the Number :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            fn*=i;
        }
        System.out.print("Factorial Of Number "+n+" is "+fn);
    }
}
