package JavaCollection;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    private Set<AlunoSet> alunos = new HashSet<>();

    private Map<Integer, AlunoSet> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //retorna um lista "ready only" que não pode ser alterada por qualquer classe, somente pelo metodo adiciona
//        return aulas;
    }

    public Set<AlunoSet> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public void matriculaAluno(AlunoSet aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumMatricula(),aluno);
    }

    public boolean estaMatricula(AlunoSet a1) {
        return this.alunos.contains(a1);
        //verificar se existe o aluno a1 dentro da lista javaColecoes
    }

    public AlunoSet buscaMatricula(int matricula_entrada) {
        if(!matriculaParaAluno.containsKey(matricula_entrada))
            throw new NoSuchElementException();

        return matriculaParaAluno.get(matricula_entrada);



//        for (AlunoSet aluno: alunos ) {
//            if(aluno.getNumMatricula() == matricula_entrada){
//                return aluno;
//            }
//        }

//        throw new NoSuchElementException("matricula não encontrada: " + matricula_entrada);
    }
}
