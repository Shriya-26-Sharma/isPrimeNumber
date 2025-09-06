 public class Pattern {
 public static void main(String[] args) {
 System.out.println("The Pattern is");
Pattern1();
}
static void Pattern1(){   //function start
int rows=0;
while(rows<5)  {
System.out.print("*");
int i=0;
while(i<rows){
    System.out.print(" *");
    i++;
}
System.out.println();
rows++;
}
}  

}