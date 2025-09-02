import java.util.Scanner;
class Agegrp
{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter your Age:");
int age =sc.nextInt();
 if (age>=65){
    System.out.println("YOU ARE SENIOR CITIZEN");
 }
else if (age >=20 ){
    System.out.println("YOU ARE AN ADULT");
}
else if(age>=13)
{
    System.out.println("You are Teen Age");
}else if(age<=13)
{
    System.out.println("You are a Child");
}
sc.close();
}
}