
import java.util.*;

public class ReverseInt {
    public static int reverse(int n) {
        long reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
                return 0;
            n /= 10;
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        if (input > Integer.MAX_VALUE || input < Integer.MIN_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(reverse((int) input));
        }
    }
}

