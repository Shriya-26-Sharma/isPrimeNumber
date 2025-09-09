import java.util.*;
public class armStrong {
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number");
       int num=sc.nextInt();
       if(isArmstrong(num)){
        System.out.println(num +"  :  It is Armstrong");
       } else 
       System.out.println("Not an Armstrong no. : "+num);
        sc.close();
    }
    public static boolean isArmstrong(int num)
    { 
        int sum =0;
     for (int i=num;i>0;i=i/10){
        int r = i%10;
        sum = sum+ r*r*r;
     }
      if ( sum == num){
        return true;
      }else 
      return false ;
    }
  } 