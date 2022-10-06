package henracaAndPolimosfirmo;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //substituir construtor padrao do java
    public Conta(int agencia, int numero){
        total ++;
        System.out.println("total de conta: " + total);
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("numero da conta: " + this.numero + " agencia:: " + this.agencia);

    }


    public double getSaldo(){
        return this.saldo;
    }

    /*get e set manual*/
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        if(numero <= 0 ){
            System.out.println("número da conta não pode ser negativo");
            return;
        } else {
            this.numero = novoNumero;
        }

    }

    /*get e set gerado pelo intellij*/
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Agencia não pode ser negativa!");
            return;
        } else {
        this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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

    public static int getTotal(){
        return Conta.total;
    }


}
