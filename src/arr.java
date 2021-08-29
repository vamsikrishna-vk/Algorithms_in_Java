public class arr {
    public static void main(String args[]){
        int[] arr={0,1,2,2,3};

        for(int i=0;i<arr.length;i++){
            int j = Math.abs(arr[i]);
            System.out.print(Math.abs(arr[i]) + " ");
            System.out.println(Math.abs(arr[j]) + " ");
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.println(j + " ");
        }
        }
    }

