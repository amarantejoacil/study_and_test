package Polimorfismo;

public class Veiculo {

    private String placa;
    public void ligar(){
        System.out.println("veiculo ligado");
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
