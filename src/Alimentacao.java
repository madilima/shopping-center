public class Alimentacao extends Loja {

    private Data dataAlvara;
    public Alimentacao(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        String string = super.toString();
        string += "Data Alvara: " + this.dataAlvara + "\n";

        return string;
    }
}
