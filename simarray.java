import java.util.*;
class simarray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size ");
        int size=sc.nextInt();
        int a[]= new int[size];
       for(int i = 0;i<5;i++)
       {
       System.out.println("Enter the numbers");
       a[i]=sc.nextInt();   // input
       }
    int sum = 0 ;
     int av=0;
     for(int i = 0;i<5;i++)
       {
        sum=sum+a[i];
        av=sum/size;
       }
       System.out.println("Sum is "+sum+"Average is "+av);
        sc.close();
    }
}
