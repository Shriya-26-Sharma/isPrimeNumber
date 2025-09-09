import java.util.*;
public class palin {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
   int num =sc.nextInt();
   if(isPalin(num))
   {
   System.out.println(num+" is a Palindrome Number.");
   }
   else 
   System.out.println(num+" is not a Palindrome.");
    sc.close();
   }
     public static boolean isPalin(int num){
     int s = 0;
      for(int i = num ;i>0; i= i/10)
      {
        int  r = i % 10;
          s=s*10+r;
      }
          if (s == num){
          return true;
          } 
          else 
          return false;
      }
}