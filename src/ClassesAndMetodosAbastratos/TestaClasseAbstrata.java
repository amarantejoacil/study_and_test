package ClassesAndMetodosAbastratos;

public class TestaClasseAbstrata {

    public static void main(String[] args) {
        EditorVideo editorvideo = new EditorVideo();
        editorvideo.setSalario(1000);
        editorvideo.setSenha("2222");
        System.out.println(editorvideo.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        gerente.setSenha("senha-sistema-interno");
        System.out.println(gerente.getBonificacao());

        Atendimento atendimento = new Atendimento();
        atendimento.setSalario(300);
        System.out.println(atendimento.getBonificacao());


        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);

//        boolean autenticou = editorvideo.autentica("2222");
//        System.out.println(autenticou);

    }
}
