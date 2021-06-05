//find the number of digits in the binary equivalent of a digit using recursion
import java.util.Scanner;
public class BinaryDigitsRecursion {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= read.nextInt();
        int result= BinaryCount(number);
        System.out.print(result);
    }
    static int BinaryCount(int num){
        if(num==1){
            return 1;
        }
        else{
            return BinaryCount(num/2)+1;
        }
    }
}
