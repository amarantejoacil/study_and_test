package CalcularImpostos;

public abstract class Conta {

    private int agencia;
    private int conta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double deposita(double valor){
        return this.saldo = this.saldo + valor;
    }

    public double saca(double valor){
        if(valor > this.saldo){
            System.out.println("saldo insuficiente!");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("saque realizado com sucesso!");
        }
        return this.saldo;
    }



}
