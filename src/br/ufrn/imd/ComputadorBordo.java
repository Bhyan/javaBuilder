package br.ufrn.imd;

public class ComputadorBordo {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void showCombustivel() {
        System.out.println("Nível combustível: " + carro.getCombustivel());
    }

    public void showStatus() {
        if (this.carro.getMotor().isLigado()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro desligado");
        }
    }
}
