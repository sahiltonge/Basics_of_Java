import java.util.Scanner;
public class Calculator
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number A:");
        double A= sc.nextDouble();
        System.out.print("Enter the Number B:");
        double B= sc.nextDouble();
        System.out.print("Enter Operator:");
        char Operator= sc.next().charAt(0);

        double result;
        switch(Operator)
        {
            case '+': result=A+B;System.out.println("Addition of Number:"+result);break;
            case '-': result=A-B;System.out.println("Subtraction of Number:"+result);break;
            case '*': result=A*B;System.out.println("Multiplication of Number:"+result);break;
            case '/': result=A/B;System.out.println("Division of Number:"+result);break;
        }
        sc.close();
    }
}
