// program to check if elements in array are unique
public class ElementsInArrayAreDistinct {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,5}; // initialize and assign an integer array
        boolean result=true; // initialize and assign resut as true
        statement1:
        for(int i=0;i<arr.length-1;i++){  // for loop for picking elements

            for(int j=0;j<arr.length;j++){ // for loop for comparing them with all other elements
                if(arr[j]==arr[i]&& i!=j){ // check if the elements are equal
                    result=false;
                    break statement1;

                }
            }
        }
        System.out.print(result);
    }
}
