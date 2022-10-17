package ClassesAndMetodosAbastratos;

public class EditorVideo extends Funcionario implements Autenticavel{


    private String senha = "2222";

    //implementação do método abstract
    @Override
    public double getBonificacao() {
        System.out.println("Editor Video: Salário padrão + 500");
        return super.getSalario() + 500;
    }

    @Override
    public void setSenha(String senha) {

    }

    @Override
    public boolean autentica(String senha) {
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
