import java.util.Scanner;

// Algorithm to find the GCD of two numbers using Consecutive integer checking
public class ConsecutiveIntegerCheckingToFindGCD {
    public static void main(String Args[]) {
        Scanner read = new Scanner(System.in); // initialize Scanner Object
        int m, n, gcdResult; //to find GCD of m,n
        System.out.println("enter two numbers");
        m = read.nextInt(); // Read input m from user
        n = read.nextInt(); // Read input n from user
        gcdResult = gcd(m, n);// Compute GCD
        System.out.println(gcdResult);
    }

    static int gcd(int m, int n) {
        int t; // temporary variable
        if (m > n) {
            t = n;
        } else {
            t = m;
        }
        for (int i = t; i >= 1; i--) {
            if (m % i == 0 ) {
                if(n % i ==0){
                    return i;
                }
            }
        }
    return 0;
    }

}
