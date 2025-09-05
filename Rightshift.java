import java.util.*;

class Rightshift
{
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the number");
     int num=sc.nextInt();
     System.out.println("Right Shift :"+ (num>>1));
     sc.close();
    }
}