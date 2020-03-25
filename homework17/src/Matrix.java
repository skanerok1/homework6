public class Matrix {

        public static void main(String[] args) {

            int[][] matrixA;
            matrixA = new int[5][5];

            matrixA[0][0] = 1;
            matrixA[0][1] = 1;
            matrixA[0][2] = 1;
            matrixA[0][3] = 1;
            matrixA[0][4] = 1;
            matrixA[1][0] = 7;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
