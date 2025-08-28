// import java.util.Scanner;
// public class fact {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long n = sc.nextInt();
//         int[] result = new int[500];
//         result[0]=1;
//         int carry =0;


//         for(int i=1;i<n;i++){
//             result[i]=result[i]*i;
//         }



//         for(int i=0;i<n;i++){
//             System.out.print(result[i]);
//         }
//         sc.close();
//     }
// }



import java.util.Scanner;

public class fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[5000];  
        result[0] = 1;  
        int size = 1;   
        for (int x = 2; x <= n; x++) {
            int carry = 0;
            for (int i = 0; i < size; i++) {
                int prod = result[i] * x + carry;
                result[i] = prod % 10;   
                carry = prod / 10;       
            while (carry > 0) {
                result[size] = carry % 10;
                carry /= 10;
                size++;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
        sc.close();
    }
    }
}