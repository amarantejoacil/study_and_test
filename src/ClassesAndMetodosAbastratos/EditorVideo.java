package ClassesAndMetodosAbastratos;

public class EditorVideo extends Funcionario{

   //implementação do método abstract
    @Override
    public double getBonificacao() {
        System.out.println("Editor Video: Salário padrão + 500");
        return super.getSalario() + 500;
    }
}
