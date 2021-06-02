// find the largest number in a list of n numbers
public class LargestElementInArray {
    public static void main(String args[]){
        int[] list={1,45,546,34756635,435345,44}; // initialize and assign an array of 6 elements
        int Largest=list[0]; // making first element of array as largest
        for(int i=0;i<list.length;i++){
            if(Largest<list[i]){ // check if largest is grater than other elements
                Largest=list[i];
            }
        }
        System.out.print(Largest); // print largest element in list
    }
}
