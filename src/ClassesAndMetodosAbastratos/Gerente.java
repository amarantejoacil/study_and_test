package ClassesAndMetodosAbastratos;

public class Gerente extends Funcionario{


    @Override
    public double getBonificacao() {
        System.out.println("Gerente Regra: Salario + 2000");
        return getSalario() + 2000;
    }


}
