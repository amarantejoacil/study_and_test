package HerancaAndConstrutores;

public class ContaCorrente extends Conta {

    //utilizando construtor especifico da classe pai
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorAsacar = valor + 0.2;
        System.out.println(valor);
        System.out.println(valorAsacar);
        return super.saca(valorAsacar);
    }
}
