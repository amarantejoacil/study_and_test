public class TesteContaEncaps {
    public static void main(String[] args) {

        ContaEncaps conta = new ContaEncaps();
//        acesso de forma direta, não recomendavel
//        conta.numero = 1337;
        conta.setNumero(1337);
        conta.setAgencia(60509);
        System.out.println("getAgencia: "+ conta.getAgencia());
        System.out.println("getNumero: "+ conta.getNumero());

        //vinculando conta ao cliente através do atributo titular
        ClienteEncaps paulo = new ClienteEncaps();
        paulo.setNome("paulo da silva");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("nova profissão");
        System.out.println(conta.getTitular().getProfissao());

        //testando validação get e set
        conta.setNumero(-50);
        conta.setAgencia(-20);







    }


}
