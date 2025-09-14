import java.util.*;
public class search2D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int simp[] []=arrayInput.inputArray();
        System.out.println("Enter the number you want to search");
        int n=sc.nextInt();
        boolean isNum=isNum(simp, n);
        if(isNum)
        {
        System.out.println("Your number is Found");
        }else
        System.out.println("Number is not Presnt there.");
        sc.close();
    }
    public static boolean isNum(int simp[][],int n){
      for(int i = 0;i<simp.length;i++){
      for(int j=0;j<simp.length;j++){
      if(simp[i][j]==n){
        return true;
      }
      }}
        return false;
    }
} 
