import java.util.Scanner; 
public class arrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " th number");
            a[i] = sc.nextInt();
        }
        return a;

    }
}
