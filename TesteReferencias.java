public class TesteReferencias {
    public static void main(String[] args) {
        
        Funcionario editor = new editorDeVideo();
        Funcionario g2 = new Gerente();
        Gerente g3 = new Gerente();

    

        g2.setSalario(1000);
        g2.setNome("Joao");

        editor.setSalario(2000);
        System.out.println(editor.getBonificacao());
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        ControleBonificacao controle2= new ControleBonificacao();
        controle2.registra(g3);
        
        System.out.println("teste");
       

    }//fim main    
}//fim class
