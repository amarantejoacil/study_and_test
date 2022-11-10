package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdemStrings {


    public static void main(String[] args) {


        //ordenação de forma antiga
        List<String> palavras = new ArrayList<String>();
        palavras.add("zalavra1");
        palavras.add("malavra2");
        palavras.add("palavra3");

        Collections.sort(palavras);
        System.out.println(palavras);

        //for antigo
        //lista para cada s imprimira s
        palavras.forEach(s ->{
            System.out.println(s);
        });

    }
}

