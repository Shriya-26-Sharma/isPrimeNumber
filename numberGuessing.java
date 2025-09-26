import java.util.*;
public class numberGuessing {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=15;
      int numg;
     do {
     System.out.println("Enter a Number between 1 to 20:");
      numg=sc.nextInt();
     }while(numg!=num);
     System.out.println("Hwloo you guessed it ryt!!!!");
     sc.close();   
    }
}
