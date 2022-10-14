package Polimorfismo;

public class ControleDetran {

    //multa qualquer objetivo que seja do tipo veiculo
    // utiliza o método especifico de cada classe filha
    public void Multar(Veiculo v){
        System.out.println(v.getPlaca());
    }

}
