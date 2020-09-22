public class Cliente implements Autenticavel{

    private int senha;
    
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            System.out.print("cliente cadastrado");
            return true;
        } else {
            return false;
        }
    }
}
