import java.util.Scanner;
public class EvenAndOdd
{
    public static void main(String[]args)
    {
     Scanner sc= new Scanner(System.in);             //Taking user input
     System.out.println("Enter the number:");
     double n= sc.nextDouble();                        // Variable deceleration

     if(n%2==0)                                      // conditon reminder =0
     {
         System.out.println("Even");
     }
     else
     {
         System.out.println("odd");
     }
    }
}
