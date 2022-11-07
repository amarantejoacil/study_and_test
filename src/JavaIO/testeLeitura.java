package JavaIO;

import javax.imageio.IIOException;
import java.io.*;

public class testeLeitura {

    public static void main(String[] args) throws IOException {


        //criando estrutura para leitura de arquivo, porem em binario
        InputStream fis = new FileInputStream("testealura.txt");

        //melhorando os dados binarios para caracteres
        Reader isr = new InputStreamReader(fis);

        //da a possibilidade de ler a linha
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }



        br.close();
    }
}
