import java.util.*;
class table {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter a number you want table ");
int num=sc.nextInt();
mulTable(num);
sc.close();
    }
 public static void mulTable(int num){
 for (int i =1;i<=10;i++){
System.out.println(num+" X "+i+" = "+(num*i));
 }
 }
}
