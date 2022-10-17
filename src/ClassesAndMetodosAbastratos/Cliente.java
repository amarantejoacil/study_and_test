package ClassesAndMetodosAbastratos;


//assinando contrato com interface Autetica
//sendo assim deve implementar oq a interface solicitada
public class Cliente implements Autenticavel {

    private String senha;

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
