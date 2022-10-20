package JavaExcecoes;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Excecao: " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

//         forma detalhada
//        ArithmeticException ex = new ArithmeticException("deu errado");
//        throw ex;

         //forma simplificada
        //Para lançar uma exceção, além de instanciá-la, é necessário lançá-la através do throw.
          throw  new ArithmeticException("deu errado");


//        System.out.println("Fim do metodo2");
    }
}
