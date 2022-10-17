package henracaAndPolimosfirmo;

public class Mamifero {
    private boolean possui_olhos;
    private String mensagem;
    private int velocidade_corrida;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isPossui_olhos() {
        return possui_olhos;
    }

    public void setPossui_olhos(boolean possui_olhos) {
        this.possui_olhos = possui_olhos;
    }

    public int getVelocidade_corrida() {
        return velocidade_corrida;
    }

    public void setVelocidade_corrida(int velocidade_corrida) {
        this.velocidade_corrida = velocidade_corrida;
    }

    //POLIMORFICOS, UTILIZANDO MESMO METODO COM IMPLEMENTAÇÃO DIFERENTE NAS FILHAS
    public int get_velocidade_maxima(int velocidade_corrida){
        return velocidade_corrida * 2;
    }


}
