// find if the pattern exist in the text string
import java.util.Scanner;
public class BruteforceStringMatching {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter text String");
        String text=read.nextLine();
        System.out.println("Enter Pattern string");
        String pattern=read.nextLine();
        System.out.println(StringMatching(text,pattern));
    }
    static int StringMatching(String text,String pattern){
        for(int i=0;i<=text.length()-pattern.length();i++){
            for(int j=0;j<pattern.length();j++){
                if(text.charAt(i+j)==pattern.charAt(j)){
                    if(j==pattern.length()-1){
                    return 1;
                    }
                    continue;
                }
                else{
                    break;
                }
            }
        }
        return 0;
    }
}
