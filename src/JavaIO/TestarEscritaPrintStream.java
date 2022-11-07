package JavaIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestarEscritaPrintStream {

    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = new PrintStream("teste_escrita_alura.txt");
        ps.println("teste PrintStream");
        ps.println("teste PrintStream 2");
        ps.close();

    }

}
