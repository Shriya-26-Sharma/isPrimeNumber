 import java.util.*;
 class ternaryMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int greatestNum=num1>num2?num1:num2;
        System.out.println("The greatest is :"+greatestNum);
        sc.close();
    }
}