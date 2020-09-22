public class sistemaInterno {

    private int senha = 2222;

   
    public void autentica(Autenticavel g){
        boolean autenticou= g.autentica(this.senha);

        if(autenticou == true){
            System.out.print("Prabanes, vc esta acessando o sistema interno");
        } else{
            System.out.print("Voce não possui acesso");
        }
    }
    
}
