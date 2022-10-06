package Inicio;

public class TesteValoresEncaps {
    public static void main(String[] args) {

        ContaEncaps conta = new ContaEncaps(123,321);
        ClienteEncaps paulo = new ClienteEncaps();
        paulo.setNome("paulo da silva");
        conta.setTitular(paulo);

        //testando validação get e set
//        conta.setNumero(-50);
//        conta.setAgencia(-20);


        System.out.println(conta.getNumero());







    }


}
