import java.util.Random;

/**
 * Created by Шынар on 15.05.2015.
 */
public class matrix {
    public static void main(String[] args) {
        int[][] A =
                {       {1,2,3},
                        {4,5,6},
                        {7,8,9}};


        int[][] B =
                {       {9,-5,4},
                        {3,4,7},
                        {5,3,2}};


        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.format("%3d ", C[i][j]);
            }
            System.out.println();
        }
    }
}
