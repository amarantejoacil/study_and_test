package ColecaoWrappersLambda;

import HerancaAndConstrutores.Conta;
import HerancaAndConstrutores.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {


    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(11,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,22);

        boolean existe = lista.contains(cc2);
        System.out.println(existe);

        for(Conta conta: lista){
            System.out.println("---------------exemplo TesteArrayListEquals -----------------");


        }


    }
}
