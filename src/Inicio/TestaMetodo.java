package Inicio;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(500);

        System.out.println(contaDoPaulo.saldo);
        System.out.println("conseguiuRetirar: " + conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean conseguiuTransferir = contaDaMarcela.transfere(1200, contaDoPaulo);
        System.out.println("conseguiuTransferir: " + conseguiuTransferir);


    }
}
