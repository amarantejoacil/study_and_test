public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titulo;

    public void deposita(double valor){
        this.saldo = saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo- valor;
            return true;
        } else {
            return false;
        }
    }

}
