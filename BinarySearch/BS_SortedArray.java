import java.util.Scanner;
class BS{
    int search(int[] array,int n,int target){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (array[mid]==target){ 
                return mid;
            }
            else if(target>array[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}

public class BS_SortedArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        BS bs = new BS();
        int result = bs.search(array, n, target);
        System.out.println("index"+result);
        sc.close();
    }
}