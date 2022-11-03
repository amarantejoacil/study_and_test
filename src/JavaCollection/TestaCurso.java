package JavaCollection;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Curso um","Joacil");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);
//        aulas.add(new Aula("Aula 01", 20));
//        System.out.println(aulas);/
//        javaColecoes.getAulas().add(new Aula("aula 2",20)); // teste excessão: UnsupportedOperationException
        javaColecoes.adiciona(new Aula("Aula 01",30));
        javaColecoes.adiciona(new Aula("Aula 02",20));
        javaColecoes.adiciona(new Aula("Aula 03",5));

        System.out.println(javaColecoes.getAulas());


        /**
         *ArrayList vs Linkedlist
         *Vantagem: Arraylist: Lista muitos longas e trabalha muito com a lista o arraylist é muito rapida para inserção e pesquisar os últimos registros
         * Problema: Arraylist: adicionar elementos, reordenação de elementos
         *
         * Linkedlist: vantagem quando preciso alterar/adicionar/excluir frequentemente o inicio da lista
         *Linkedlist: desvantagem: problema de pesquisar os últimos elemtnos, se a lista for muito grande
         */


    }

}
