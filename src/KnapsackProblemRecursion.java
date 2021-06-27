
//Knapsack Problem using Recursion by bruteforce approach
public class KnapsackProblemRecursion {
    public static void main(String args[]){
     int BagSize=10;
     int[] weights={1,3,4,6};
     int[] values={20,30,10,50};
     int[][] DP=new int[7][11];
     int n= weights.length;
     for(int i=0;i<7;i++){
         DP[i][0]=0;
     }
     for(int j=0;j<11;j++){
         DP[0][j]=0;
     }
     for(int item=1;item<=n;item++){
         for(int capacity=1;capacity<=BagSize;capacity++){
             int maxValWithoutCurr = DP[item - 1][capacity];
             int maxValWithCurr = 0;
             int weightOfCurr = weights[item-1];
             if (capacity >= weightOfCurr) {
                 maxValWithCurr = values[item - 1];

                 int remainingCapacity = capacity - weightOfCurr;
                 maxValWithCurr += DP[item - 1][remainingCapacity];
             }
             DP[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr);
         }
     }

        System.out.println(DP[n][BagSize]);
    }
}
