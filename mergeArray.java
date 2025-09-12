public class mergeArray {
    public static void main(String[] args) {
        int input1 []=arrayInput.inputArray();
        int input2 []=arrayInput.inputArray();
        int []mergedArr=merge(input1, input2);
        System.out.println("Merged array is:");
        arrayInput.displayArray(mergedArr);

    }
    public static int [] merge(int input1[],int input2[]){
      int nsize=input1.length+input2.length;
      int newarr[]=new int [nsize];
      int i=0,j=0,k=0;
      while(i<input1.length|| j<input2.length){
        if(j==input2.length||(i<input1.length&&input1[i]<input2[j])){
            newarr[k]=input1[i];
            i++;
            k++;
        } else  {newarr[k]=input2[j];
            j++;
            k++;}
      }
      return newarr;
        }
}
