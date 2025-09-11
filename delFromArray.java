import java.util.*;
public class delFromArray {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int input []=arrayInput.inputArray();
     System.out.println("Enter the num you want to delete");
     int n =sc.nextInt();
     int[] deleteNum=deleteNum(input, n);
     arrayInput.displayArray(deleteNum);
     sc.close();
    }
    public static int[] deleteNum(int input[], int n){
        int newnum[]=new int[input.length];
     for (int i =0;i<input.length;i++){
        if(input[i]!=n){
            input [i]=newnum[i];
           
        }else
            input[i]=newnum[i-1];  
     }
        return newnum;
    }
}
