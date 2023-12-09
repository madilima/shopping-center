public class Informatica extends Loja {

    private double seguroEletronicos;
    public Informatica(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        String string = super.toString();
        string += "Seguro de eletrônicos: " + this.seguroEletronicos + "\n";

        return string;
    }
}
