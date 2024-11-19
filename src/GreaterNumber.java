import java.util.Scanner;
public class GreaterNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number A:");
        double a=sc.nextDouble();
        System.out.print("Enter the Number B:");
        double b=sc.nextDouble();
        System.out.print("Enter the Number C:");
        double c=sc.nextDouble();

        double max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.print("Max Number:"+max);
    }

}
