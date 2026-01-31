package gr.aueb.cf.cf9.ch6;
// 2D array and populate its elements

public class Matrix_Initialiazing_traverse_11 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3]; //2 rows, 3 collumns
        //intialization
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
//traverse
        for (int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int [] row: matrix) {
            for ( int element : row){
                System.out.println(element + " ");
            }
            System.out.println();
        }


    }
}
