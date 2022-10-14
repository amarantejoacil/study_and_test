package Polimorfismo;

public class TestaVeiculo {
    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        v.ligar();


        Carro c = new Carro();
        c.ligar();

        Moto m = new Moto();
        m.ligar();

        System.out.println("-----------------------------");

        Veiculo v2 = new Carro();
        v2.setPlaca("A");
        v2.ligar();

        Veiculo v3 = new Moto();
        v3.setPlaca("B");
        v3.ligar();

        System.out.println("-----------------------------");
        ControleDetran controleDetran = new ControleDetran();
        controleDetran.Multar(v2);
        controleDetran.Multar(v3);



    }
}
