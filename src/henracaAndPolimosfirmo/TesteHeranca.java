package henracaAndPolimosfirmo;

public class TesteHeranca {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.setPossui_olhos(true);
        mamifero.setMensagem("oi eu sou mamifero");
        System.out.println("mamifero: " + mamifero.isPossui_olhos() + " > " + mamifero.getMensagem());
        System.out.println(mamifero.get_velocidade_maxima(10));
        System.out.println("---------------------------------------------");


        Cachorro cachorro = new Cachorro();
        cachorro.setPorte("medio");
        cachorro.setMensagem("oi eu sou cachorro usando msg do mamifero");
        System.out.println("cachorro porte: " + cachorro.getPorte() + " > " + cachorro.getMensagem());
        System.out.println(cachorro.get_velocidade_maxima(20));
        System.out.println("---------------------------------------------");

        Elefante elefante = new Elefante();
        elefante.setTromba(true);
        System.out.println(elefante.get_velocidade_maxima(5));
        elefante.setMensagem("oi eu sou elefante usando msg do mamifero");
        elefante.setPorte("Grande");
        System.out.println("elefante tromba: " + elefante.isTromba() + " > " + elefante.getMensagem() + " Porte: " +
                elefante.getPorte());



    }

}
