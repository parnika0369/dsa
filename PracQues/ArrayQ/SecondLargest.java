//find the second largest element of array

import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int array[] = new int[len];
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        int largest = array[0];
        for (int i = 0; i < len; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        int SLargest =- 1;
        for(int i = 0; i < len; i++){
            if(array[i]>SLargest&&array[i]!=largest){
                SLargest=array[i];
            }
        }
        System.out.println(SLargest);
        sc.close();

    }
}

