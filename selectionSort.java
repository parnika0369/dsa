import java.util.Scanner;
public class selectionSort{
    public static void main(String[]args){
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
        for(int i=0;i<(n-1);i++){
            int min = i;
            for(int j=i;j<(n);j++){
                if (array[j]<array[min]){
                    min = j;
                }
            }
            //swap
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
}