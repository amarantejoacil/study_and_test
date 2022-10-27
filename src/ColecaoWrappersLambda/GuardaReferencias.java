package ColecaoWrappersLambda;
import HerancaAndConstrutores.Conta;

public class GuardaReferencias {

    private Conta[] referencia;
    private int index_livre;


    public GuardaReferencias(){
        this.referencia = new Conta[10];
        this.index_livre = 0;
    }

    public void adiciona(Conta ref){
        this.referencia[this.index_livre] = ref;
        this.index_livre++;
    }

    public int getQuantidadeDeElementos() {
        return this.index_livre;
    }

    public Conta getReferencia(int pos) {
        return this.referencia[pos];
    }
}
