package ColecaoWrappersLambda;

import HerancaAndConstrutores.Conta;

import java.util.ArrayList;

public class TesteArrayReferencia {

    public static void main(String[] args) {


        //criando array de contas
        Conta[] contas = new Conta[5];

        //criando uma conta
        Conta c1 = new Conta(11,11);

        //adicionando conta no array posicao 0
        contas[0] = c1;

        //criando uma conta
        Conta c2 = new Conta(22,22);

        //adicionando conta no array posicao 0
        contas[1] = c2;

        ArrayList<Conta> lista = new ArrayList<>();



        System.out.println("-----------------acessando array referencia--------------------------");
        System.out.println("posicao 0: " + contas[0].getNumero());
        System.out.println("posicao 1: " + contas[1].getNumero());

    }

}
