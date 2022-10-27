package ColecaoWrappersLambda;

import HerancaAndConstrutores.Conta;

public class Teste {

    public static void main(String[] args) {

        GuardaReferencias guardaReferencias = new GuardaReferencias();
        Conta cc = new Conta(55,55);
        Conta cc2 = new Conta(66,66);

        guardaReferencias.adiciona(cc);
        guardaReferencias.adiciona(cc2);

        int tamanho = guardaReferencias.getQuantidadeDeElementos();
        System.out.println(tamanho);


        Conta ref = guardaReferencias.getReferencia(0);
        System.out.println("recuperando posicao: " + ref.getNumero());


    }

}
