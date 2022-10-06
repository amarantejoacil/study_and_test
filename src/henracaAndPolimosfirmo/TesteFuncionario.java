package henracaAndPolimosfirmo;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setCpf("222.222.222-99");
        funcionario.setSalario(2000);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());

    }
}
