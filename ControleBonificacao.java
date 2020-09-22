 class ControleBonificacao {

    private double soma;
        
    public void registra(Funcionario g)  {
        double boni = g.getBonificacao(); 
        this.soma = this.soma + boni; 
        System.out.print("g3 foi registrado");  
    }

    public double getSoma() {
        return soma;
    }
        
}//fim class
