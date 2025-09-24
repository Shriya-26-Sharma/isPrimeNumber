import java.util.*;
class absoluteTernary {
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int num =sc.nextInt();
  int result =num<0?-num:num;
  System.out.println("The Absolute Number is:"+result);
  sc.close();
} 
}
