import java.util.*;

public class CeltoFeh {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Celcius");
double cel=sc.nextDouble();
double feh=32+(9*cel/5);
System.out.println("Fahrenheit : "+ feh );
}
}
