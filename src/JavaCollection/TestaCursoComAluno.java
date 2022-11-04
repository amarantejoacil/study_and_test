package JavaCollection;

public class TestaCursoComAluno {

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

        System.out.println("Todos alunos matriculados");

//        for(int i = 0; i < javaColecoes.getAlunos().size(); i++){
//            System.out.println(javaColecoes.getAlunos());
//
//        }

//        Para cada Aluno lista : dentro de java colecoes faça isso
//        for (AlunoSet alunos: javaColecoes.getAlunos()) {
//            System.out.println(alunos);
//        }

        //para cada aluno "a" faço uma ação
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("aluno está matriculado: " + javaColecoes.estaMatricula(a1));


        AlunoSet turini = new AlunoSet("Rodrigo Turini", 777);
        System.out.println("aluno matriculado? ");
        System.out.println(javaColecoes.estaMatricula(turini));

        System.out.println("a1 == turini");
        System.out.println(a1 == turini);

        System.out.println("a1 EQUALS turini");
        System.out.println(a1.equals(turini));



    }
}
