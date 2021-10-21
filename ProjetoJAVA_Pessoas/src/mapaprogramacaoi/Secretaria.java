package mapaprogramacaoi;

/**
 *
 * @author fdinardo
 */
public class Secretaria extends Funcionario {

    public Secretaria(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    public Secretaria() {
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

    @Override
    public void exibeDados() {
        //super.exibeDados();
        System.out.println("\n Dados das SECRETARIAS(OS)"
                + "\n Nome da Secretária(o): " + this.nome
                + "\n Documento: " + this.documento
                + "\n Ramal: " + this.ramal);
    }

    @Override
    public double calculaSalarioAnual() {
        double salario = 3500.00;
        double decimoterc = 2800.00;
        salario = (salario * 12) + decimoterc;
        System.out.println("\n O Salario Anual da Secretária Ana + Décimo Terceiro é: " + salario);
        return salario;
    }

}
