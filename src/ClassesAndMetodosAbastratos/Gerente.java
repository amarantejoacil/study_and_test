package ClassesAndMetodosAbastratos;

//extends Funcionio e interface Autenticavel
public class Gerente extends Funcionario implements Autenticavel{

    private String senha = "55";




    @Override
    public double getBonificacao() {
        System.out.println("Gerente Regra: Salario + 2000");
        return getSalario() + 2000;
    }


    @Override
    public void setSenha(String senha) {
        this.senha = senha;

    }

    @Override
    public boolean autentica(String senha) {
        System.out.println("senha sistema: " + senha + " senha: gerente:" + this.senha);
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
