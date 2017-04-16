package util;

import java.util.Scanner;

/**
 * Console util methods
 *
 */
public class Console {

    private static final Scanner keyboard = new Scanner(System.in);

    /**
     * Solicita uma string do teclado e a le
     *
     * @param prompt
     *
     * @return String informada
     */
    public static String readString(String prompt) {
        Console.printLn(prompt);

        return keyboard.next();
    }

    /**
     * Imprime uma string
     *
     * @param s
     */
    public static void print(String s) {
        System.out.print(s);
    }

    /**
     * Imprime uma linha vazia
     *
     */
    public static void printLn() {
        System.out.println();
    }

    /**
     * Imprime uma string em uma nova linha
     * @param s
     */
    public static void printLn(String s)
    {
        System.out.println(s);
    }
}
