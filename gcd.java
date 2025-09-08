import java.util.*;
class gcd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter two Number");
      int first=sc.nextInt();
       int second = sc.nextInt();
      int gg=gc(first,second);
System.out.println("The GCD is :"+gg);
        sc.close();
    }
    public static int gc(int first,int second ){
  int g =1;
  int i =2;
   int less =least(first, second);
   while(i<=less){
  if (first%i == 0 && second%i ==0){
    g = i;
  }
     i ++;
    }
   return g;
    }
    public static int least(int first , int second){
  if(first<second){
    return (first);
  }else
        return second;
    }
}