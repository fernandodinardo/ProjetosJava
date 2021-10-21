package mapaprogramacaoi;

/**
 *
 * @author fdinardo
 */
public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(double comissao, double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
        this.comissao = comissao;
    }
    
    public Vendedor() {
        this(0, 0, 0, "", "");
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
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

    public double salarioMesComComissao() {
        double comissao = 2500;
        salario = salario+comissao;
        System.out.println("\n O Salário + Comissão dos vendedores é: " + salario);
        return salario;
    }

    @Override
    public void exibeDados() {
        //super.exibeDados();
        System.out.println("\n Dados dos VENDEDORES(AS)"
                + "\n Nome do Vendedor(a): " + this.nome
                + "\n Documento: " + this.documento
                + "\n Ramal: " + this.ramal);
    }

}
