
class MatrixIdentityCheck {

    public static boolean isIdenticalMatrix(int[][] m1, int[][] m2) {
        // Check if dimensions are different
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        // Check each element
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(isIdenticalMatrix(m1, m2));
    }
}
