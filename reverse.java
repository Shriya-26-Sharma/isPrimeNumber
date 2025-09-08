import java.util.*;
class reverse {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int first=sc.nextInt();
      int rEVerse=rEVERSE(first);
System.out.println("Reverse of your number is "+rEVerse);
      sc.close();
    }
    public static int rEVERSE(int first){
  int newnum=0;
  while(first>0){
    int digit =first%10;
    newnum =newnum*10+digit ;
   first = first / 10;  }
    return newnum; 
}
}
