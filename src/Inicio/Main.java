package Inicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("criando objetivo tipo conta");
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("saldo: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("saldo incrementado: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 150;
        System.out.println("saldo segunda conta: " + segundaConta.saldo);


    }
}