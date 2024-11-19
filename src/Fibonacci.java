import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        int a=0, b=1, n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number Limit for Sequence:");
        n=sc.nextInt();
        System.out.print("Fibonacci Series:"+a+","+b);
        for(int i=2;i<n;i++)
        {
            int next=a+b;
            System.out.print(","+next);
            a=b;
            b=next;
        }
//        int n , a = 0, b = 1;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the Number");
//        n=sc.nextInt();
//        System.out.print("Fibonacci Series: " + a + ", " + b);
//
//        for (int i = 2; i < n; i++) {
//            int next = a + b;
//            System.out.print(", " + next);
//            a = b;
//            b = next;
//        }

    }
}
