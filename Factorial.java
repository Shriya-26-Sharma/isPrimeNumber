import java.util.*;
class Factorial{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
long facto=fact(num);
System.out.println("Factorial is "+ facto);
sc.close();
}
 public static long fact(int num){
 if (num<2){
    return(1);
 } 
 long mul=1;
    for (int i =2 ; i<=num;i++){
      mul *= i;
    }
   return mul;
}
}
