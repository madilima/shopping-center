public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public float getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String toString() {
        String string = "Nome: " + this.nome + "\n";
        string += "Quantidade de funcionários: " + this.quantidadeFuncionarios + "\n";
        string += "Salário base dos funcionários: R$ " + this.salarioBaseFuncionario + "\n";
        string += "Endereço: " + this.endereco + "\n";
        string += "Data de fundação: " + this.dataFundacao + "\n";

        return string;
    }

    public float gastosComSalario() {
        if (this.salarioBaseFuncionario == -1) {
            return -1;
        }

        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    public String tamanhoDaLoja() {
        if  (this.quantidadeFuncionarios < 10) {
            return "P";
        }

        if (this.quantidadeFuncionarios <= 30) {
            return "M";
        }

        return "G";
    }
}
