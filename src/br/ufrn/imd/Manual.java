package br.ufrn.imd;

public class Manual {
    private final Tipo tipo;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorBordo computadorBordo;
    private final GPS gps;

    public Manual(Tipo tipo, int assentos, Motor motor, Transmissao transmissao,
                  ComputadorBordo computadorBordo, GPS gps) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorBordo = computadorBordo;
        this.gps = gps;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + tipo + "\n";
        info += "Quantidade de assentos: " + assentos + "\n";
        info += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometragem() + "\n";
        info += "Transmissão: " + transmissao + "\n";
        if (this.computadorBordo != null) {
            info += "Computador de bordo: Ligado" + "\n";
        } else {
            info += "Computador de bordo: Não disponível" + "\n";
        }
        if (this.gps != null) {
            info += "GPS: Ligado" + "\n";
        } else {
            info += "GPS: Não disponível" + "\n";
        }
        return info;
    }
}
