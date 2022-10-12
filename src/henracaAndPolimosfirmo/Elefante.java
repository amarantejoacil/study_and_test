package henracaAndPolimosfirmo;

public class Elefante extends Cachorro {
    private boolean Tromba;

    public boolean isTromba() {
        return Tromba;
    }

    public void setTromba(boolean tromba) {
        Tromba = tromba;
    }

    @Override
    public int get_velocidade_maxima(int velocidade_corrida){
        return velocidade_corrida * 3;
    }
}
