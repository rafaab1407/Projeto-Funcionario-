//n criamos obejtos dessas classe, pq é bastrata, não existe so um funcionario mas sim cargos q extendem funcionario
public abstract class Funcionario{

    private String nome;
    private String cpf;
    private int salario;

    public Funcionario(){
        System.out.println("Funcionario cadastrado");
    }

    public abstract double getBonificacao();

    public double aumentaSalario(){
        double aumento = 5000;
        return aumento;
    }


    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

}// fim class
