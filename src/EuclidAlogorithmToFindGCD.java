// Using recursion to find the GCD of two numbers using Euclid algorithm
import java.util.Scanner;
public class EuclidAlogorithmToFindGCD {

    public static void main(String args[]){
        Scanner read=new Scanner(System.in); // initialize Scanner Object
        int m,n,gcdResult; //to find GCD of m,n
        System.out.println("enter two numbers");
        m=read.nextInt(); // Read input m from user
        n=read.nextInt(); // Read input n from user
        gcdResult=gcd(m,n);// Compute GCD
        System.out.println(gcdResult);
    }
    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n,m%n);
        }

    }
}
