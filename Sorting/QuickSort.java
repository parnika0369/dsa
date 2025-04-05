import java.util.Scanner;
public class QuickSort {
    static class QuickSortSol {
        public void sort(int[]array){
            int n = array.length;
            quickSort(array,0,n-1);
        }
        private void quickSort(int[] array,int low,int high){
            if (low<high){
                int pvt_idx = partition(array,low,high);
                quickSort(array, low, pvt_idx-1);
                quickSort(array, pvt_idx+1, high);
            }
        }
        private int partition(int[] array,int low ,int high){
            int pvt = array[low];
            int start = low;
            int end = high; 

            while(start<end){
                while(start<=high&&array[start]<=pvt){
                    start++;
                }
                while(end>=low&&array[end]>pvt){
                    end--;
                }
                if(start<end){
                    swap(array,start,end);
                }
            }
            swap(array,low,end);
            return end;
        }

        private void swap(int array[],int i ,int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        QuickSortSol qs = new QuickSortSol();
        qs.sort(array);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();

    }
}
