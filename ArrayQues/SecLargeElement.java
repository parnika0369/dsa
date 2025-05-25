package ArrayQues;
import java.util.Scanner;
public class SecLargeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int array[]=new int[len];
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        int largest = array[0];
        for(int i=0;i<len;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        int Slargest =
        sc.close();

    }
}
