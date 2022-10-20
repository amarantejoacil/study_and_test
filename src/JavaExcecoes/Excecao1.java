package JavaExcecoes;

public class Excecao1 {

    public static void main(String[] args) {
        int a = 5;


        try {
            int b = a / 0;
            Conta c = null;
            c.deposita();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(" getMessage: " + e.getMessage());
            System.out.println(" getCause: " + e.getCause());
            e.printStackTrace();
        }
    }
}

