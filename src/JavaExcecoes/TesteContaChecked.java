package JavaExcecoes;

public class TesteContaChecked {

    public static void main(String[] args) {

        // ContaChecked
        try{
            ContaChecked ck = new ContaChecked();
            ck.deposita();
        } catch(MinhaExcecaoeChecked ex){
            ex.printStackTrace();
        }


    }



}
