import file.MatrixFileReader;
import util.Console;

public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        Islands islands;

        matrix = getMatrixFromUserInput();

        islands = new Islands(matrix);

        Console.printLn(islands.count());
    }

    /**
     * Pede o caminho de um arquivo para o usuario e retorna a matriz gerada
     * a partir deste arquivo
     *
     * @return matriz
     */
    private static int[][] getMatrixFromUserInput() {
        String filePath;

        filePath = Console.readString("Informe o caminho do arquivo desejado: ");

        MatrixFileReader reader = new MatrixFileReader(filePath);

        return reader.read();
    }
}
