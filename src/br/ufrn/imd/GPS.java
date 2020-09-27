package br.ufrn.imd;

public class GPS {
    private String rota;

    public GPS() {
        this.rota = "Avenida Senador Salgado Filho, 3000 - Lagoa Nova, Natal";
    }

    public GPS(String rotaManual) {
        this.rota = rotaManual;
    }

    public String getRota() {
        return rota;
    }
}
