public class TesteReferencia {

    /*
    * Testando referencia
    * Quando crio uma instancia e recebo ela em outra sem new o que acontece que as duas irão apontar para o mesmo endereço de memoria.
    * Ou seja se eu atribui um valor na segunda conta, irá mudar na segunda, pois as duas são as mesma referencias.
    * Para que isso não aconteça é necessário a cada nova conta dar um new.
    *
    *
    * */

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;
        System.out.println("saldo primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo segunda conta: " + segundaConta.saldo);

    }


}
