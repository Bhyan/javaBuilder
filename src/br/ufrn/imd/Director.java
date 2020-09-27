package br.ufrn.imd;

public class Director {
    public void construtorCarroEsporte(Builder builder) {
        builder.setTipo(Tipo.CARRO_ESPORTE);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(Transmissao.SEMI_AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGPS(new GPS());
    }

    public void construtorCarroCidade(Builder builder) {
        builder.setTipo(Tipo.CARRO_CIDADE);
        builder.setAssentos(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmissao(Transmissao.AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGPS(new GPS());
    }

    public void construtorSUV(Builder builder) {
        builder.setTipo(Tipo.SUV);
        builder.setAssentos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setGPS(new GPS());
    }
}
