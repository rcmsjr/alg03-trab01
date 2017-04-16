/**
 * Estrutura de ilhas
 */
public class Islands {
    private static final int PIVOT = 1;
    private int[][] matrix;

    /**
     * Recebe a matriz em que deve ser buscado as ilhas
     *
     * @param matrix
     */
    public Islands(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Conta o numero de ilhas na matriz
     *
     * @return total de ilhas
     */
    public int count() {
        int counter = 0;

        for (int line = 0, lineLen = this.matrix.length; line < lineLen; line++) {
            for (int col = 0, colLen = this.matrix[line].length; col < colLen; col++) {
                if (matrix[line][col] != PIVOT) {
                    continue;
                }

                if (col > 0 && matrix[line][col-1] == PIVOT) {
                    continue;
                }

                if (line > 0 && matrix[line-1][col] == PIVOT) {
                    continue;
                }

                counter++;
            }
        }


        return counter;
    }
}
