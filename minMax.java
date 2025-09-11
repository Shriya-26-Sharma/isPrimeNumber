public class minMax {
public static void main(String args[]){
int [] input=arrayUtility.inputArray();
int min=mii(input);
int max=mxx(input);
System.out.println("Maximum is:"+max);
System.out.println("Minimum is:"+min);
}
public static int mii(int input[]){
    int min =input[0];
    for(int i=0;i<input.length;i++)
    {
        if(input[i]<min){
            min=input[i];
        }
    }
return min;
}
public static int mxx(int input[]){
int max =0;
for(int i = 0;i<input.length;i++)
{
    if(input[i]>max)
    {
  max=input[i];
    }
}
return max;
}
}