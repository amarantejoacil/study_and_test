package JavaCollection;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando o arrayList",21);
        Aula a2 = new Aula("Lista de Objetos",20);
        Aula a3 = new Aula("Relacionando de lista e objetivos",15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

//        ordenando por tempo
//        aulas.sort(Comparator.comparing(Aula::getTempo));

//        ordenando por titulo
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);



    }
}
