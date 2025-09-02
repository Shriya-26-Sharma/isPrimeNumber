import java.util.*;
  class DiscntOff {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Ticket Discount Counter");
    System.out.println("Enter your Age");
    int age =sc.nextInt();
    System.out.println("Are you a Female? true or false");
    boolean isFemale = sc.nextBoolean();
    if(age<5)
    {
    System.out.println(" WOW !! you got a discount of 75% ");
    }
    else if (isFemale){
        System.out.println("You got 50% discount");
    }
    else if (age>60 && !isFemale ){
    System.out.println("You got 25% dicount");
    } 
    else{
        System.out.println("You Got NO DISCOUNT");
    }
    sc.close();
    }
 }
