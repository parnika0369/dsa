import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        System.out.println("Enter the array of length "+n);
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");

        //sorting
        for(int i=(n-1);i>0;i--){
            for(int j=0;j<i;j++){
                if (array[j]>array[j+1]){
                     //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
}

