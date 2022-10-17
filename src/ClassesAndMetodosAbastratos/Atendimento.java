package ClassesAndMetodosAbastratos;

public class Atendimento extends Funcionario{


    @Override
    public double getBonificacao() {
        System.out.println("Atendimento Regra: Salario +100");
        return getSalario() + 100;
    }
}
