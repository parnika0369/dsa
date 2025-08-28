import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int temp = 0;
    int[] array = new int[len];
    for(int i=0;i<len;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<len;i++){
        System.out.print(array[i]+" ");
    }
      for(int i=len;i>len;i--){
        array[i]=temp;
        array[i-1]=array[i];
        temp=array[i-1];
    }
    sc.close();
    
    
    }
}