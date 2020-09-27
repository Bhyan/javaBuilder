package br.ufrn.imd;

public class CarroBuilder implements Builder {
    private Tipo tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorBordo computadorBordo;
    private GPS gps;

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    public Carro getResult() {
        return new Carro(tipo, assentos, motor, transmissao, computadorBordo, gps);
    }
}
