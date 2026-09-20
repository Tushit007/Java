
public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int sr = 0;//startrow
        int er = matrix.length - 1;//endrow
        int sc = 0;//startcolumn  
        int ec = matrix[0].length - 1;//endcolumn
        while (sr <= er && sc <= ec) {

            //TOP BOUNDARY
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }
            //Right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }
            //BOTTOM BOUNDARY
            for (int i = ec - 1; i >= sc; i--) {
                if (sr == er) {
                    break; //to avoid printing the same row again

                }
                System.out.print(matrix[er][i] + " ");
            }
            //Left
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) {
                    break; //to avoid printing the same column again

                }
                System.err.print(matrix[i][sc] + " ");
            }
            sr++;//move to next row
            er--;//move to previous row 
            sc++;//move to next column  
            ec--;//move to previous column

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}
