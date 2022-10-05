public class ContaEncaps {
    private double saldo;
    private int agencia;
    private int numero;

    Cliente titular;

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

    public boolean transfere(double valor, ContaEncaps conta_destino){
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

    //tem como objetivo retornar o saldo... exe: qnd o saldo for do tipo private
    public double pegaSaldo(){
        return this.saldo;
    }

}
