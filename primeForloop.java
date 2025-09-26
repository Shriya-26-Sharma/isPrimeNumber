import java.util.*;
class primeForloop {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a num:");
int num=sc.nextInt();
System.out.println("Your Number is "+(isPrime(num)? "Prime ": "Not prime"));
 sc.close();
 }
 public static boolean isPrime(int num){
 for(int i =2;i<num;i++){
   if(num%i==0){
    return false;
   }}
 return true;
 }
}