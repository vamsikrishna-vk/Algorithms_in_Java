// swap two numbers using bit manipulation
public class SwapTwoNumbers {
    public static void main(String args[]){
        int a=10555;
        int b=20003;
        System .out.println("a = "+a);
        System.out.println("b = "+b);
        a=a^b; // a x-or b
        b=a^b;
        a=a^b;
        System .out.println("after swap a = "+a);
        System.out.println("after swap b = "+b);
    }
}
