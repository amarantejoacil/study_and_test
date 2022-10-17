package ClassesAndMetodosAbastratos;

public class SistemaInterno {

    private String senha = "senha-sistema-interno";


    public void autentica(Gerente g){

            boolean autenticou = g.autentica(this.senha);

            if(autenticou){
                System.out.println("Pode entrar no sistema");
            } else {
                System.out.println("Não pode entrar no sistema");
            }
        }
    }





