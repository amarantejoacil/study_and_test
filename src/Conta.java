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

    public boolean transfere(double valor, Conta conta_destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta_destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso!");
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
            return false;
        }

    }

}
