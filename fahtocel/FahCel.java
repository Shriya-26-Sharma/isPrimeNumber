import java.util.*;
public class FahCel {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Fahrenheit");
double fah=sc.nextDouble();
double cel =(fah-32)*5/9;
System.out.println("Celsiuis :"+ cel + "C ");
sc.close();
}
}
