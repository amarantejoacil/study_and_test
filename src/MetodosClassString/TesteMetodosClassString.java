package MetodosClassString;

public class TesteMetodosClassString {


    public static void main(String[] args) {


        String texto_zero = "joacil amarante";
        String texto_um = "JOACIL AMARNATE";
        String texto_dois = "VITORIA GRACILIANA";
        String texto_tres = "GOIABA";
        String encontrar_quatro = "Este texto é interessante!";
        String encontrar_cinco = "       Este texto é interessante! ";
        String string_vazio = "";
        int idade = 20;


        texto_um = texto_um.replace("A","a");
        System.out.println("teste replace: " + texto_um);

        texto_dois = texto_dois.toLowerCase();
        System.out.println("teste toLowerCase: " + texto_dois);

        char c = texto_tres.charAt(0);
        System.out.println("charAt: " + c);

        int retorno_encontrar_texto = encontrar_quatro.indexOf("interessante");
        int tamanho_texto = encontrar_quatro.length();
        System.out.println("indexOf: " + retorno_encontrar_texto);
        System.out.println("length: " + tamanho_texto);

        String teste_substring = encontrar_quatro.substring(13);
        System.out.println("teste_substring: " + teste_substring);

        System.out.println("string_vazio" + string_vazio.isEmpty());

        encontrar_cinco = encontrar_cinco.trim();
        System.out.println("trim(): " + encontrar_cinco);

        System.out.println(encontrar_cinco.contains("contains: " + "interessante"));


        System.out.println("imprimindo tipo da variavel: " + texto_um.getClass().getSimpleName());


        System.out.println("--------------TESTE compareTo E compareToIgnoreCase-------------------");
        System.out.println(texto_zero.compareTo("joacil amarante") == 0 ? true : false);
        System.out.println(texto_zero.compareTo("Joacil amarante") == 0 ? true : false);
        System.out.println(texto_zero.compareToIgnoreCase("JOACIL amarante") == 0 ? true : false);


        System.out.println("convertendo int em string: " + String.valueOf(idade));














    }
}
