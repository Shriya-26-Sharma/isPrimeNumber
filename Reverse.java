     public  class Reverse  {
     public static void main(String args[])
     {
     int input[]=arrayInput.inputArray();
     reverse(input);
     System.out.println("Reversed Array is :");
     arrayInput.displayArray(input);
     }
     public static void reverse(int input[])
     {
     for(int i =0;i<input.length/ 2;i++)
     {
      int swap =input[i];
      input [i]=input[(input.length-1)-i];
      input[(input.length-1)-i]=swap;
     }
     }
     }
