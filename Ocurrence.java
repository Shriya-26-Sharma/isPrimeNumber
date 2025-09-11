import java.util.*;
public class Ocurrence {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
 int [] num =arrayUtility.inputArray();
 System.out.println("Enter the no. you want to find");
 int n=sc.nextInt();
 int occ=numOfOccur(num, n);

System.out.println("The number is "+occ+"times present.");
 sc.close();
}
 public static int numOfOccur(int num[],int n){
 int occ =0;
 for(int i =0;i<num.length;i++){
    if(num[i]==n){
        occ++;
    }
 }
return occ;
 }
}