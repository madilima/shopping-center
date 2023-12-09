public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        String string = super.toString();
        string += "Taxa de comercialização: R$ " + this.taxaComercializacao + "\n";

        return string;
    }
}
