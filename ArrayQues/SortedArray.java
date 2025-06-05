import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<len-1;i++){
            if(array[i] > array[i+1]){
                System.out.println("unsorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}