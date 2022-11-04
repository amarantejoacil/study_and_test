package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class AlunoSet {

    private String nome;
    private int numMatricula;


    public AlunoSet(String nome, int numMatricula){
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return getNome() + " " + getNumMatricula();
    }
}
