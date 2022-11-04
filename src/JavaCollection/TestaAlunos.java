package JavaCollection;

import java.util.*;

public class TestaAlunos {


    public static void main(String[] args) {

        /**
         * a lista não sai na ordem , ele ignora a ordem
         * não aceita elementos repitidos, garantindo que os valores ali não únicos
         * não existe ordem dentro de um conjunto, sendo assim não tenho indice
         * Sua vantagem é a velocidade de execução para grande volumes dos dados
         */

        Set<String> alunos = new HashSet<>();
        alunos.add("Maria");
        alunos.add("Guil");
        alunos.add("Antonio");
        alunos.add("Eduarda");
        alunos.add("Vitoria");
        alunos.add("Vitoria");
        alunos.add("Zenaide");

        System.out.println(alunos);



        //convertendo Set em arraylist para ordenar
        List<String> alunosEmLista = new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);

    }
}
