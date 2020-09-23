public class testaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Rafael Bprges");
        funcionario.setCpf("144.918.166.03");  
        funcionario.setSalario(2000);
   
        System.out.println(funcionario.getBonificacao());
        System.out.println("teste branch");
    }//fim main
}//fim class
