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
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");

        //sorting
        for(int i=0;i<n;i++){
            int j=i;
            while (j>0 && array[j]<array[j-1]){
                //swapping
                int temp=array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
                j--;
            }
        }
        
        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        }
    }

