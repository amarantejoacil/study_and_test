package Inicio;

public class RepeticaoFor {
    public static void main(String[] args) {


// inicia varial | condição | executar
//        for (int contador = 0; contador <= 10; contador++) {
//            System.out.println(contador);
//        }


//        for (int multiplicador = 0; multiplicador <= 3 ; multiplicador++){
//            System.out.println("primeiro for aqui: " +multiplicador);
//            for (int inicio = 0; inicio <= 2 ; inicio++){
//                System.out.println("segundo for: " + inicio);
//            }
//        }

        for (int x = 0; x <= 4; x++) {
            if (x == 3) {
                break;
            }
            System.out.println(x);
        }

    }
}
