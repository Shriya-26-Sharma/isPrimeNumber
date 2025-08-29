import java.util.*;
public class calci
{    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int a , b;
    System.out.println("Welcome to Arthematic Calculator");
    System.out.println("Enter two integers");
    a= input.nextInt();
    b= input.nextInt();
    int sum = a+b;
    int diff= a-b;
    double mul=a*b;
    double div = a/b;
    double rem=a%b;
    System.out.println("To Add"+sum);
    System.out.println("To Difference"+sum);
    System.out.println("To Multiply"+sum);
    System.out.println("To Division"+sum);
    System.out.println("To Remainder"+sum);
    input.close();

    }
}
