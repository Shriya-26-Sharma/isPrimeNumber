import java.util.*;
class passwordChecker {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String password;
    do{
        System.out.println("Enter Your Password");
         password =sc.next();
    }
    while(!isValidPassword(password));          // if password not valid then again ask the password
    System.out.println("Thanks for entering the password !!");
    sc.close();
    }
    public static boolean isValidPassword(String password){
    return password.length()>6;
    }
}
