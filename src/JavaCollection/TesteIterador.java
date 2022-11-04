package JavaCollection;

import java.util.Iterator;
import java.util.Set;

public class TesteIterador {


    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Curso um","Joacil");
        javaColecoes.adiciona(new Aula("Aula 01",30));
        javaColecoes.adiciona(new Aula("Aula 02",20));
        javaColecoes.adiciona(new Aula("Aula 03",5));


        AlunoSet a1 = new AlunoSet("Antonio",123);
        AlunoSet a2 = new AlunoSet("Maria",456);
        AlunoSet a3 = new AlunoSet("Lucia",789);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);


        Set<AlunoSet> alunos = javaColecoes.getAlunos();

        //forma antiga de percorrer uma coleção
        Iterator<AlunoSet> iterator = alunos.iterator();
        while (iterator.hasNext()){ //iterator.hasNext() existe um aluno?
            AlunoSet proximo = iterator.next(); //chama um proximo
            System.out.println(proximo);
        }


    }
}
