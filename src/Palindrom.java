import java.util.Scanner;
public class Palindrom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Word or Number:");
        String str=sc.nextLine();
        String reversedStr=new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr))
        {
            System.out.print(str+" is a palindrom");
        }else
        {
            System.out.print(str+" is not a Palindrom");
        }
//        String str = "madam";
//        String reversedStr = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(reversedStr)) {
//            System.out.println(str + " is a palindrome.");
//        } else {
//            System.out.println(str + " is not a palindrome.");
//        }

    }
}
