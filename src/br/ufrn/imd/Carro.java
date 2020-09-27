package br.ufrn.imd;

public class Carro {
    private final Tipo tipo;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorBordo computadorBordo;
    private final GPS gps;
    private double combustivel = 0;

    public Carro(Tipo tipo, int assentos, Motor motor, Transmissao transmissao,
                 ComputadorBordo computadorBordo, GPS gps) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorBordo = computadorBordo;
        this.computadorBordo.setCarro(this);
        this.gps = gps;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    public GPS getGps() {
        return gps;
    }
}
