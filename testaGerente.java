public class testaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Rafael");
        System.out.println(g1.getNome());
        g1.setSalario(1000);
        g1.aumentaSalario();
        System.out.println(g1.aumentaSalario());
        ControleBonificacao cb = new ControleBonificacao();
        cb.registra(g1);    
        System.out.print("teste git");

        

        
        
        
       
    }
}
