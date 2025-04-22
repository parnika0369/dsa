import java.util.Scanner;

public class SumofDigits {
    public static int sumofDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofDigits(n));
    }
}
