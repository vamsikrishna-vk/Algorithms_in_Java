// search for an element in an array using Sequential Search or Linear search
import java.util.Scanner;
public class SequentialSearch {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60};
        Scanner read=new Scanner(System.in);
        System.out.println("Enter a number ");
        int key=read.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("Element found");
            }
            else{
                if(i==arr.length-1){
                    System.out.print("Element not found");
                }
            }

        }
    }
}
