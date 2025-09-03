import java.util.*;

class BitwiseAnd
{
 public static void main (String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println("Bitwise And Operator");
System.out.println("Enter a Number:");
int num1 =sc.nextInt();
System.out.println("Enter another number:");
int num2 =sc.nextInt();
System.out.println("The Bitwise And Operator"+(num1 & num2));
   sc.close();
    }
}