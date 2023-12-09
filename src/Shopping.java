public class Shopping {

    private String nome;

    private Endereco endereco;

    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantilidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantilidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nome)) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;

        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null) {
                if (this.lojas[i] instanceof Informatica && tipo.equals("Informática")) {
                    quantidade++;
                    continue;
                }

                if (this.lojas[i] instanceof Vestuario && tipo.equals("Vestuário")) {
                    quantidade++;
                    continue;
                }

                if (this.lojas[i] instanceof Alimentacao && tipo.equals("Alimentação")) {
                    quantidade++;
                    continue;
                }

                if (this.lojas[i] instanceof Bijuteria && tipo.equals("Bijuteria")) {
                    quantidade++;
                    continue;
                }

                if (this.lojas[i] instanceof Cosmetico && tipo.equals("Cosmético")) {
                    quantidade++;
                    continue;
                }
            }
        }

        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double seguroMaisCaro = 0;

        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) this.lojas[i];
                if (informatica.getSeguroEletronicos() > seguroMaisCaro) {
                    seguroMaisCaro = informatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }

}
