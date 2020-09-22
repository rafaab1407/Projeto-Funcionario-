public class Gerente extends Funcionario implements Autenticavel{
    
    private int senha;

    public Gerente(){
        System.out.println("Gerente cadastrado");
    }   
    

    public double getBonificacao(){
        System.out.print("executou gerente");
        return  super.getSalario(); // usar metodos da classe mae
        
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override//reescrita de metodo chamano o metodo na classe mae
    public double aumentaSalario() {
        
        return super.aumentaSalario() +200;
    }
}//fim class gerente
