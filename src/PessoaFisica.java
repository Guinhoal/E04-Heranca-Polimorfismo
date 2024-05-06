public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprimir() {
        System.out.printf("Nome: %s, Endereço: %s, CPF: %s, Idade: %d, Sexo: %c\n", nome, endereco, cpf, idade, sexo);
    }
}