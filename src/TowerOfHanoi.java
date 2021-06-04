// program to solve tower of hanoi problem

/* shift n-1 disks to tower b from tower a
   shift nth disk from a to b
   shift n-1 disks from b to c
 */
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String args[]){
        Scanner read= new Scanner(System.in);
        System.out.println("enter number of disks");
        int num= read.nextInt();
        TOH(num,'A','C','B');
    }
    static void TOH(int n,char from,char to  ,char using){
        if (n == 1) {
            System.out.println("move the disk "+n+" from rod "+from+" to rod "+to);
            return;
        }
        else{
           TOH(n-1,from,using,to);
           System.out.println("move the disk "+n+" from rod "+from+" to rod "+to);
           TOH(n-1,using,to,from);
        }
    }
}
