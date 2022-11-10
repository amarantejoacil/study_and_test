package Java8;

import JavaCollection.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteExemploAluno8 {

    public static void main(String[] args) {


        List<Curso> cursoList = new ArrayList<Curso>();
        cursoList.add(new Curso("python","joacil"));
        cursoList.add(new Curso("javascript","maria"));
        cursoList.add(new Curso("java 8","antonio"));

//        cursoList.sort(Comparator.comparing(Curso::getAlunos));

        cursoList.forEach(c -> System.out.println(c.getAulas()));

    }
}
