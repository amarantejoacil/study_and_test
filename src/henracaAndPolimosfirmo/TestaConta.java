package henracaAndPolimosfirmo;

public class TestaConta {

    public static void main(String[] args) {
        Conta conta = new Conta(123,321);
        conta.deposita(100);
        System.out.println(conta.getSaldo());

    }


}
