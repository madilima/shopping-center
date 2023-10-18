public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString() {
        String string = super.toString();
        string += "Meta de vendas: " + this.metaVendas + "\n";

        return string;
    }
}