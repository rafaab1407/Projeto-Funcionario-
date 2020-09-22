public class testaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Rafael");
        funcionario.setCpf("144.918.166.03");  
        funcionario.setSalario(2000);

        System.out.println(funcionario.getBonificacao());
    }//fim main
}//fim class
