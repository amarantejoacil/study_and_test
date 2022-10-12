package henracaAndPolimosfirmo;

public class Cachorro extends Mamifero {

    private String Porte;

    public String getPorte() {
        return Porte;
    }

    public void setPorte(String porte) {
        Porte = porte;
    }

    @Override
    public int get_velocidade_maxima(int velocidade_corrida){
        return velocidade_corrida * 4;
    }

}
