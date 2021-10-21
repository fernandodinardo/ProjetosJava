package mapaprogramacaoi;

/**
 *
 * @author fdinardo
 */
public abstract class Funcionario extends Pessoa {

    protected double salario;
    protected int ramal;
    
    public Funcionario(double salario, int ramal, String nome, String documento) {
        super(nome, documento);
        this.salario = salario;
        this.ramal = ramal;
    }

    public Funcionario() {
        this(0, 0, "", "");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double calculaSalarioAnual() {
        double salario = 5500;
        double decimoterc = 4800;
        salario = (salario*12)+decimoterc;
        System.out.println("O Salario Anual + Décimo Terceiro é: " + salario);
        return salario;
        
    }

}
