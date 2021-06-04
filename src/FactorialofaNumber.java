// Program to find the factorial of a given number using recursion
import java.util.Scanner;
public class FactorialofaNumber {
    public static void main(String args[]){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= read.nextInt();
        int result=fact(number);
        System.out.println(result);
    }
    static int fact(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
