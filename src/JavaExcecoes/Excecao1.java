package JavaExcecoes;

public class Excecao1 {

    public static void main(String[] args) {
        int a = 5;

        try {
            int b = a /0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }







    }
}
