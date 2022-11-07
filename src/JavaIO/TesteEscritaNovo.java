package JavaIO;

import java.io.*;

public class TesteEscritaNovo {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("teste_escrita_alura.txt");
//        Writer ows = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(ows);

        FileWriter fw = new FileWriter("teste_escrita_alura.txt");
        fw.write("novo metodo de escrita");
//        fw.write("\n");//quebra de linha
        fw.write(System.lineSeparator());//quebra de linha de forma que funcione em qlqr sistema operacional

        fw.write("novo paragrafo - novo metodo escritaa");

        fw.close();

    }



}
