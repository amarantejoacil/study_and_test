package ClassesAndMetodosAbastratos;

/*
- Uma interface é um contrato
-todos metodos deve ser abstrato, não pode ter nada concreto, nem um atributo.
- Quem assina esse contrato deve implementar seus metodos abstratos ou senha,
deve implementar setSenha e autentica.

*/
public abstract interface Autenticavel {

    public abstract void setSenha(String senha);

    public abstract boolean autentica(String senha);

}
