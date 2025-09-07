import java.util.*;
public class Digit {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a num");
    int num=sc.nextInt();
    int sum=digi(num);
    System.out.println("Sum of digits is "+sum);
    sc.close();
    }
    public static int digi(int num){
        int sum=0;
     for (int i = num;i>0;i=i/10)
     {
        int r = i%10;
        sum+=r;
     }
     return sum;
    }
}
