package Inicio;

public class TesteContaCliente {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Joacil amarante";
        cliente.cpf = "222.222.222-22";
        cliente.profissao = "Analista de Sistema";


        Conta contaDoJoacil = new Conta();
        contaDoJoacil.deposita(100);

        contaDoJoacil.titular = cliente;
        System.out.println(contaDoJoacil.titular.nome);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);



    }

}
