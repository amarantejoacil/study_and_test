package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {


    private String descricao;
    private List<Motorista> motoristas = new ArrayList<Motorista>();

    public Veiculo(String descricao){
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    @Override
    public String toString() {
        return descricao.toString();
    }

    public void adiciona(Motorista motorista){
        this.motoristas.add(motorista);

    }
}
