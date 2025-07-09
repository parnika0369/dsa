package Hashing;
import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //creating array2 hash array
        int[] array2 = new int[n+1];
        for(int i=0;i<n+1;i++){
            array2[i]=0;
        }

        for(int num:array){
            array2[num]+=1;
        }

        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
        
        System.out.println(" ");

        for(int i=0;i<n+1;i++){
            System.out.print(array2[i]);
        }


        sc.close();
    }
}
