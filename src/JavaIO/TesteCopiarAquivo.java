package JavaIO;

import java.io.*;

public class TesteCopiarAquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("testealura.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("teste_escrita_alura.txt");
        Writer ows = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(ows);

        String linha = br.readLine();

        while (linha != null){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
