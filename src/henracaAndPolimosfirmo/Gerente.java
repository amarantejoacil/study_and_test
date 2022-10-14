package henracaAndPolimosfirmo;

public class Gerente extends Funcionario {


    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        System.out.println("bonificação gerente");
        return super.getBonificacao() + this.getSalario();
    }


    //    public double getBonificacao(){
//        //super = o atribulto salario é da classe pai
////        return ( this.salario * 0.1) + super.salario;
//        return super.salario;
//    }


}



