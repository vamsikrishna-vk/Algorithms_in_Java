// Sieve Algorithm to find the prime numbers
import java.util.Scanner;

public class SieveAlgorithmToFindPrimeNumbers {
    public static void main(String Args[]){
        Scanner read = new Scanner(System.in); // initialize Scanner Object
        int n; // initialize variable n
        System.out.println("enter a number");
        n= read.nextInt(); // Read input from user
        boolean[] arr =new boolean[n+1]; // Initialize a boolean array with n elements
        for(int i=2;i<n;i++){
            arr[i]=true; //filling the array with boolean true
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(arr[i]==true){
                for(int j=i+1;j<=n;j++){
                    if(j%i==0){
                        arr[j]=false;
                    }
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true){
                System.out.println(i); // printing prime numbers
            }
        }
    }
}


/*

[2 3 4 5 6 7 8 9]



 */


