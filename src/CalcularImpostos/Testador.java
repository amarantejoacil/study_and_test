package CalcularImpostos;

public class Testador {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);

        System.out.println(cc.getSaldo());


        SeguroDeVida seguroDeVida = new SeguroDeVida();



        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(cc);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());



    }
}
