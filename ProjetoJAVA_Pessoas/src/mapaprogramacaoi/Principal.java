package mapaprogramacaoi;

/**
 *
 * @author fdinardo
 */
public class Principal {

    private static String senha;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Presidente presidente = new Presidente();
        Secretaria secretaria1 = new Secretaria();
        Secretaria secretaria2 = new Secretaria();
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();

        presidente.setNome("Asdrubal Leôncio Correa");
        presidente.setDocumento("12345678901");
        presidente.setRamal(100);

        secretaria1.setNome("Fátima Leôncio Correa");
        secretaria1.setDocumento("954.546.676-68");
        secretaria1.setRamal(110);

        secretaria2.setNome("Ana Leôncio Correa");
        secretaria2.setDocumento("178.979.257-65");
        secretaria2.setRamal(120);

        vendedor1.setNome("João Leôncio Correa");
        vendedor1.setDocumento("345.138.045-56");
        vendedor1.setRamal(101);
        vendedor1.setComissao(2500);

        vendedor2.setNome("Vanessa Leôncio Correa");
        vendedor2.setDocumento("551.468.332-06");
        vendedor2.setRamal(102);
        vendedor2.setComissao(2500);

        vendedor3.setNome("Carlos Leôncio Correa");
        vendedor3.setDocumento("351.863.755-00");
        vendedor3.setRamal(103);
        vendedor3.setComissao(2500);

        cliente1.setNome("Marcos da Silva");
        cliente1.setDocumento("269.425.369-54");

        cliente2.setNome("Joana Prado Correia");
        cliente2.setDocumento("485.863.247-44");

        cliente3.setNome("Elisa dos Santos");
        cliente3.setDocumento("213.623.542-79");

        cliente4.setNome("Lucas Ferrari");
        cliente4.setDocumento("011.450.248-07");

        presidente.exibeDados();

        secretaria1.exibeDados();
        secretaria2.exibeDados();

        vendedor1.exibeDados();
        vendedor2.exibeDados();
        vendedor3.exibeDados();

        cliente1.exibeDados();
        cliente2.exibeDados();
        cliente3.exibeDados();
        cliente4.exibeDados();
        
        cliente4.verificarSenha(senha);

        presidente.calculaSalarioAnual();
        secretaria2.calculaSalarioAnual();
        
        vendedor1.salarioMesComComissao();
        vendedor2.salarioMesComComissao();
        vendedor3.salarioMesComComissao();
    }

}
