import java.util.Scanner;

public class Leap {
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Year");
int yr =sc.nextInt();
if(yr%4==0 && yr%100!=0){
System.out.println("Leap Year");
}
else if (yr%400==0 || yr%4==0){
System.out.println("Leap Year");
} else
System.out.println("NOT A Leap Year");
sc.close();
}
}
