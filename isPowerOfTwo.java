// program passed the test cases in geeks 

// User function Template for Java
import java.util.*;

class isPowerOfTwo {

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {

        System.out.println("this is a program which find if a no is power of a or not ");
        long i = 1;
        while (true) {
            i *= 2L;
            if (i == n || n == 1)
                return true;
            if (i > n || n == 0)
                return false;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long no = 0L;
        boolean isPower = false;
        System.out.println("enter a no  ");
        no = sc.nextInt();

        isPower = isPowerofTwo(no);
        if (isPower)
            System.out.println("power of 2  ");

        else
            System.out.println("not power of 2  ");

    }
}