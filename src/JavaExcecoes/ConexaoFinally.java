package JavaExcecoes;

public class ConexaoFinally implements AutoCloseable {

    public ConexaoFinally() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void fecha() {
        System.out.println("Fechando conexao MANUALMENTE");
    }

    @Override
    public void close(){
        System.out.println("fechando conexao AUTOMATICAMENTE");
    }
}

