public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (dia <= 0) {
            this.invalidarData("O dia deve ser maior que zero.");
            return;
        }

        if (mes <= 0) {
            this.invalidarData("O mês deve ser maior que zero.");
            return;
        }

        if (mes > 12) {
            this.invalidarData("O mês deve ser menor ou igual à doze.");
            return;
        }

        if (this.dia == 29 && this.mes == 2) {
            boolean anoBissexto = this.verificaAnoBissexto();

            if (!anoBissexto) {
                this.invalidarData("O ano " + this.ano + " não é bissexto.");
                return;
            }
        }

        int ultimoDiaMes = this.getUltimoDiaMes();

        if (dia > ultimoDiaMes) {
            this.invalidarData("O dia não pode ser maior que " + ultimoDiaMes + ".");
        }
    }

    private void invalidarData(String motivo) {
        System.out.println(motivo);
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        }

        if (this.ano % 400 == 0) {
            return true;
        }

        return false;
    }

    public int getUltimoDiaMes() {
        switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2: {
                boolean anoBissexto = this.verificaAnoBissexto();

                if (anoBissexto) {
                    return 29;
                }

                return 28;
            }
            default:
                return 30;
        }
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
