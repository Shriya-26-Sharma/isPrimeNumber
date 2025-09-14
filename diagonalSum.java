import java.util.*;
public class diagonalSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int simp[] []=arrayInput.inputArray();
        long isSum=isSum(simp);
        System.out.println("Sum of Diagonal is :"+isSum);
       
        sc.close();
    }
    public static long isSum(int simp[][]){
    long sum1=isLeftDiagonalSum(simp);
    long sum2=isRightDiagonalSum(simp);
    long sum =sum1+sum2;
    if(simp.length % 2 != 0){
      int in=simp.length /2 ;
      sum-=simp[in][in];
    }
    return sum;
    }
     public static int isRightDiagonalSum(int simp[][]){
      int sum=0;
      for(int i=0;i<simp.length;i++){
      int col =simp.length -1-i;
      sum+=simp[i][col];
      }
     return sum;
    }
     public static int isLeftDiagonalSum(int simp[][]){
     int sum =0;
     for(int i=0;i<simp.length;i++){
      sum+=simp[i][i];
     }
     return sum;
    }
  }
