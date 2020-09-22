public class acessarSistemaInterno {
    public static void main(String[] args) {
        Cliente gerente = new Cliente();
        gerente.setSenha(2222);

        sistemaInterno si = new sistemaInterno();
        si.autentica(gerente);
        
    }
}
