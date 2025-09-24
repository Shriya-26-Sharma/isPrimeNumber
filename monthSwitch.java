import java.util.*;
class monthSwitch {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter the months in number ");
     int num=sc.nextInt();
     String monthName =monthName(num);
     System.out.println(monthName);
        sc.close();
    }
    public static String monthName(int num){
    String month=switch(num){
    case 1 -> "Month is :January";
    case 2 -> "Month is :February";
    case 3 -> "Month is :March";
    case 4 -> "Month is :April";
    case 5-> "Month is :May";
    case 6 -> "Month is :June";
    case 7 -> "Month is :July";
    case 8 -> "Month is :August";
    case 9 -> "Month is :September";
    case 10 -> "Month is :October";
    case 11-> "Month is :November";
    case 12-> "Month is :December";
    default->"Invalid input Range in 1-12";
    };
    return month;
    }
}
