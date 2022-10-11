package henracaAndPolimosfirmo;

public class TesteHeranca {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.setPossui_olhos(true);
        mamifero.setMensagem("oi eu sou mamifero");
        System.out.println("mamifero: " + mamifero.isPossui_olhos() + " > " + mamifero.getMensagem());

        Cachorro cachorro = new Cachorro();
        cachorro.setPorte("medio");
        cachorro.setMensagem("oi eu sou cachorro usando msg do mamifero");
        System.out.println("cachorro porte: " + cachorro.getPorte() + " > " + cachorro.getMensagem());

        Elefante elefante = new Elefante();
        elefante.setTromba(true);
        elefante.setMensagem("oi eu sou elefante usando msg do mamifero");
        elefante.setPorte("Grande");
        System.out.println("elefante tromba: " + elefante.isTromba() + " > " + elefante.getMensagem() + " Porte: " +
                elefante.getPorte());



    }

}
