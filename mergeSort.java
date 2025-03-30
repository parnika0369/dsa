import java.util.Scanner;

public class MergeSort {
    void sort(int[] array,int start,int end){
        if(start==end){
            return;
        }
        int mid = (start+end)/2;
        sort(array, start, mid);
        sort(array, mid+1, end);
        merge(array,start,mid,end);
    }
    void merge(int[] array,int start,int mid,int end){
        int size = end-start+1;
        int[] mergedArr = new int[size];
        int lptr = start;
        int rptr = mid+1;
        int j = 0;


        while(lptr<=mid && rptr<=end){
            if(array[lptr]<= array[rptr]){
                mergedArr[j++] = array[lptr++];
            }
            else{
                mergedArr[j++] = array[rptr++];
            }    
        }
        while (lptr <= mid) {
            mergedArr[j++] = array[lptr++];
        }
        while (rptr <= end) {
            mergedArr[j++] = array[rptr++];
        }
        for (int i = 0; i < size; i++) {
            array[start + i] = mergedArr[i];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] array = new int[len];
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        new MergeSort().sort(array,0, len - 1);

        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");;
        }
        sc.close();
    }
}
