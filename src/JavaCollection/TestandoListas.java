package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    /** Classe com objetivo de testar listas
     * @author Joacil Amarante
     * @version 1.0
     * @param a,b,c
     *
     */

    public static void main(String[] args) {

        String aula1 = "Matemática";
        String aula2 = "Geografia";
        String aula3 = "Ciência";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        System.out.println(aulas);
        aulas.remove(1);
        System.out.println(aulas);

        System.out.println("------------------for tradicional ---------------");

        for (int i = 0; i < aulas.size() ; i++) {
            System.out.println("imprimindo aula com index: " + aulas.get(i));
        }

        System.out.println("------------------foreach ---------------");
        for (String aula: aulas) {
            System.out.println("imprimindo aulas foreach: " + aula);
        }

        System.out.println("------------------foreach LAMBDA ---------------");
        aulas.forEach(aula ->{
            System.out.println("primeiro comando");
            System.out.println("segundo comando : " + aula);
        });


        System.out.println("TESTANDO ORDENAÇÃO UTILIZANDO COLLECTION - SORT");


        System.out.println("antes de ordenar" + aulas);
        Collections.sort(aulas);
        System.out.println("depois de ordenar" + aulas);




    }

}
