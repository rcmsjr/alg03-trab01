package file;

import java.io.*;

/**
 * Leitor de arquivos textos que possuam matriz
 */
public class MatrixFileReader {
    private final String filePath;

    public MatrixFileReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Le um arquivo texto e transforma em matriz
     *
     * @return matriz
     */
    public int[][] read() {
        File file = new File(this.filePath);
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        int matrix[][] = null;

        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            matrix = this.createMatrix(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return matrix;
    }

    /**
     * Cria uma matriz atravez do leitor de buffer de um arquivo
     * @param bufferedReader
     * @throws IOException
     * @return matriz
     */
    private int[][] createMatrix(BufferedReader bufferedReader) throws IOException {
        int matrix[][];
        String currentLine;
        String[] matrixConfig;

        currentLine = bufferedReader.readLine();
        matrixConfig = currentLine.split(" ");
        matrix = new int[Integer.parseInt(matrixConfig[1])][Integer.parseInt(matrixConfig[0])];

        int i = 0;

        while ((currentLine = bufferedReader.readLine()) != null) {
            for (int x = 0, len = currentLine.length(); x < len; x++) {
                matrix[i][x] = Integer.parseInt(String.valueOf(currentLine.charAt(x)));
            }

            i++;
        }

        return matrix;

    }
}
