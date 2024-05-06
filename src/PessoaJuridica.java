public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public void imprimir() {
        System.out.printf("Nome: %s, Endereço: %s, CNPJ: %s, Número de Funcionários: %d, Setor: %s\n", nome, endereco, cnpj, numFuncionarios, setor);
    }
}