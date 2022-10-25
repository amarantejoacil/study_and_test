package ColecaoWrappersLambda;

public class IniciandoArray {


    public static void main(String[] args) {
        int[] idades = new int[5];


        for(int i = 0; i < idades.length; i++){
            idades[i] = i;

            System.out.println("indice: " + i);
            System.out.println("valores: " + idades[i]);
        }

//        System.out.println(idades);


    }


}
