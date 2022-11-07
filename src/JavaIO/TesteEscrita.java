package JavaIO;

import java.io.*;

public class TesteEscrita  {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("teste_escrita_alura.txt");
        Writer ows = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(ows);

        bw.write("escrevendo em um arquivo - estou testando kk");
        bw.newLine();
        bw.newLine();
        bw.write("novo paragrafo");

        bw.close();

    }



}
