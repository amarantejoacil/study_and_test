package henracaAndPolimosfirmo;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Joacil");
        g1.setCpf("333.333.333-33");
        g1.setSalario(5000.0);



        System.out.println(g1.getNome() + " | " + g1.getCpf() + " | " + g1.getSalario() + " | " + g1.getBonificacao());

        g1.setSenha(222);
        boolean autentica = g1.autentica(222);
        System.out.println(autentica);





    }
}
