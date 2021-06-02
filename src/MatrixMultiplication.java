// program to multiply two matrices
public class MatrixMultiplication {
    public static void main(String args[]){
        int[][] matrix1={{1,2,3},{1,2,3},{1,2,3}}; // initialize and assign a 2 dimensional matrix
        int[][] matrix2={{1,2,3},{1,2,3},{1,2,3}};
        int[][] result=new int[matrix1[0].length][matrix2.length]; // initialize a result matrix
        for(int i=0;i<matrix1[0].length;i++){
            for(int j=0;j<matrix1.length;j++){
                result[i][j]=0;
                for(int k=0;k<matrix1.length;k++){
                    result[i][j]=result[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<matrix1[0].length;i++){
            for(int j=0;j<matrix2.length;j++){
                System.out.print(result[i][j]+" ");

            }
            System.out.println();
        }
    }
}
