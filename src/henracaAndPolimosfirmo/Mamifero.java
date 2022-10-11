package henracaAndPolimosfirmo;

public class Mamifero {
    private boolean possui_olhos;
    private String mensagem;
    private String velocidade_corrida;

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

    public String getVelocidade_corrida() {
        return velocidade_corrida;
    }

    public void setVelocidade_corrida(String velocidade_corrida) {
        this.velocidade_corrida = velocidade_corrida;
    }
}
