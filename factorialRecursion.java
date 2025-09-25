import java.util.*;
class factorialRecursion {
 public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter your Number:");
 int num=sc.nextInt();
 long fact=factorial(num);
 System.out.println("Factorial is :"+fact);
 sc.close();
 }
 public static long factorial(int num){
 if(num==1){
    return 1;
 }
    return num*factorial(num-1);
 }
}
