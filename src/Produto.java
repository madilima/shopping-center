public class Produto {

    private String nome;
    private float preco;
    private Data dataValidade;

    public Produto(String nome, float preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() < this.dataValidade.getAno()) {
            return false;
        }

        if (data.getMes() < this.dataValidade.getMes()) {
            return false;
        }

        if (data.getDia() < this.dataValidade.getDia()) {
            return false;
        }

        return true;
    }

    public String toString() {
        String string = "Nome: " + this.nome + "\n";
        string += "Preço: R$ " + this.preco + "\n";
        string += "Data de Validade: " + this.dataValidade + "\n";

        return string;
    }
}
