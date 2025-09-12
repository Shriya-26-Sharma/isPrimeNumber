import java.util.Scanner;
public class arrayInput {
   public static void main(String[] args) {
      
   }
   public static int[] inputArray() {
      Scanner var0 = new Scanner(System.in);
      System.out.println("Enter the size ");
      int var1 = var0.nextInt();
      int[] var2 = new int[var1];
      for(int var3 = 0; var3 < var1; ++var3) {
         System.out.println("Enter the " + var3 + " th number");
         var2[var3] = var0.nextInt();
      }
      return var2;
   }
   public static int [] displayArray(int var2 []){
    for(int i = 0;i<var2.length;i++){
         System.out.println(var2[i]+" ");
    }
    return var2;
}
}