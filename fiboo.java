import java.util.*;
class fiboo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num till where u want the series");
        int num =sc.nextInt();
        System.out.println("The Series is :");
        fIbonacciSeries(num);
        sc.close();
    }
    public static void fIbonacciSeries(int num){
        if (num<0) return;
         System.out.println("0  ");
        if (num==0) return;
        System.out.println("1 ");
         int first =0 , second =1;
        while(first + second <= num){
         int third = first + second ;
     System.out.println(third+" ");
     first = second ;
     second =third;
     }    
    }    
}
