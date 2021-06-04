// Count the number of digits in the binary equivalent of a number
// with out using bitwise algorithms
import java.util.Scanner;
public class BinaryDigits {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=read.nextInt();// read the number
        int count=1; // initial count to 1
        while(number>1){
            count++; // increment count
            number=number/2;
        }
        System.out.println(count); // print output
    }

}
