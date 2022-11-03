package JavaCollection;

import Polimorfismo.Moto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteVeiculoMotorista {

    public static void main(String[] args) {



        Veiculo veiculos = new Veiculo("Corolla");

//        Veiculo veiculo2= new Veiculo("Astra");
//        Motorista motorista2 = new Motorista("Motorista 2", 12);



        veiculos.adiciona(new Motorista("Maria 01",19));
        veiculos.adiciona(new Motorista("Ana 02",32));
        veiculos.adiciona(new Motorista("Raul 03",24));
        veiculos.adiciona(new Motorista("Vitoria 04",55));




        System.out.println(veiculos);
        System.out.println(veiculos.getMotoristas());

        Collections.reverse(veiculos.getMotoristas());
        System.out.println("reverse inverte: " + veiculos.getMotoristas());

        Collections.shuffle(veiculos.getMotoristas());
        System.out.println("shuffle sorteio: " + veiculos.getMotoristas());












    }
}
