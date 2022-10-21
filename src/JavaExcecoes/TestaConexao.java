package JavaExcecoes;

public class TestaConexao {

    public static void main(String[] args) {

        //try com fechamento de conexao automaticamente
        try(ConexaoFinally con = new ConexaoFinally()){
            con.leDados();
        } catch (IllegalStateException e){
            System.out.println("deu erro na conexao automatica");

        }



//        Testando de maneira sem fechamento automatico
//        ConexaoFinally con = new ConexaoFinally();
//        try {
//            con.leDados();
//        } catch (IllegalStateException e){
//            System.out.println("deu erro");
//        } finally {
//            con.fecha();
//        }

    }

}
