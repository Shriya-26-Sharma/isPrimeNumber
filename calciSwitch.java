import java.util.*;
class calciSwitch {
    public static void main (String args[]){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number");
     int num1 =sc.nextInt();
     System.out.println("Enter Second number");
     int num2=sc.nextInt();
     System.out.println("Enter the operation you want to perform");
     String op=sc.next();
     int result = switch(op){
     case "+"-> num1+num2;
     case "-"-> num1-num2;
     case "*"-> num1*num2;
     case "/"-> num1/num2;
     default -> -1;
     };
     System.out.println("The Answer is:"+result);
     sc.close();   
    }
}