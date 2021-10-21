package mapaprogramacaoi;

/**
 *
 * @author fdinardo
 */
public class Cliente extends Pessoa {

    private String usuario;
    private String senha;

    public Cliente(String usuario, String senha, String nome, String documento) {
        super(nome, documento);
        this.usuario = usuario;
        this.senha = senha;
    }

    public Cliente() {
        this("", "", "", "");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public boolean verificarSenha(String senha) {
        if (usuario.equals("Lucas Ferrari") && senha.equals("123456")) {
            System.out.printf("\n Seja Bem Vindo!" + usuario);
        } else {
            System.out.println("\n Login ou senha inválidos!");
        }
        System.out.printf("\n Seja Bem Vindo! Lucas Ferrari. Sua senha é 123456\n");
        return false;
    }

    @Override
    public void exibeDados() {
        //super.exibeDados();
        System.out.println("\n Dados dos CLIENTES"
                + "\n Nome: " + this.nome
                + "\n Documento: " + this.documento);
    }

}