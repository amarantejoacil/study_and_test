package JavaCollection;

public class TestaBuscaAlunoNoCurso {

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

        AlunoSet aluno = javaColecoes.buscaMatricula(456);
        System.out.println("aluno: " + aluno);


    }
}
