import java.util.*;
public class lcm {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
System.out.println("Enter two num");
 int first=sc.nextInt();
 int second =sc.nextInt();
     int lc=lCm(first, second);
System.out.println("Lcm:"+lc);
 sc.close();
    }
    public static int lCm(int first,int second) {
   for (int i=1;i<=second;i++){
  int fact=first*i;
  if (fact%second == 0){
    return fact;
  }
   }
   return 0;
    }
}
