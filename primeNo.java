import java.util.*;
 class primeNo {
    public static void  main(String args[]){
  Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num =sc.nextInt();
boolean isPrime =isPrime(num);
if(isPrime){
System.out.println(num +" is prime");
}else
System.out.println("NOT a Prime number");
sc.close();
    }
    public static boolean isPrime(int num){
  int i=2;
  while(i<num){
    if(num%i == 0){
        return false;
    }i ++;
  } return true;
    }
}
