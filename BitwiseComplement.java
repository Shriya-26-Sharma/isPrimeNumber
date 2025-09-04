import java.util.*;

class BitwiseComplement {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num =sc.nextInt();
System.out.println("The Complement of num is :"+(~num));
sc.close();
}
}