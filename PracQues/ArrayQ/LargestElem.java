
//brute-->sorting
//optimal 
import java.util.Scanner;

public class LargestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        for (int i = 0; i < len; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}
