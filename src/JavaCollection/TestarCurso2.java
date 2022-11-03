package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarCurso2 {


    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso um","Joacil");

        javaColecoes.adiciona(new Aula("Aula 01",30));
        javaColecoes.adiciona(new Aula("Aula 02",20));
        javaColecoes.adiciona(new Aula("Aula 03",5));

        List<Aula> aulasImultaveis = javaColecoes.getAulas();
        System.out.println(aulasImultaveis);




//        Collections.sort(aulasImultaveis); não roda por causa do

    }
}
