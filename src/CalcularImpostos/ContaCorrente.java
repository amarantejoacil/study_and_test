package CalcularImpostos;

public class ContaCorrente extends Conta implements Tributavel {

    private boolean possui_programa_potos;

    public boolean isPossui_programa_potos() {
        return possui_programa_potos;
    }

    public void setPossui_programa_potos(boolean possui_programa_potos) {
        this.possui_programa_potos = possui_programa_potos;
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.10;
    }
}
