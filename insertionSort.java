import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        System.out.println("Enter the array of length "+n);
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Before swaping");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");

        //swaping
        for(int i=0;i<(n-1);i++){
            
        }




        System.out.println("After Swapping");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        }
    }

