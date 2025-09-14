import java.util.Scanner;
public class arrayInput {
   public static void main(String[] args) {    
   }
   public static int[][] inputArray() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("Enter the row ");
      int row = var0.nextInt();
        System.out.println("Enter the column ");
      int col = var0.nextInt();
      int[] []var2 = new int[row][col];
      int i=0;
      while(i<row){
         int j=0;
         while(j<col){
          System.out.println("Enter the row :"+(i+1) +" th number And Column :"+(j+1));
          var2[i][j] = var0.nextInt();
            j++;
          }
           i++;}
          return var2;
          }
   public static int [][] displayArray(int var2 [][]){
    for(int i = 0;i<var2.length;i++){
      for(int j=0;j<var2.length;j++){
          System.out.print(var2[i][j]+" ");
      }
      System.out.println(" ");
    }
    return var2;
}
}