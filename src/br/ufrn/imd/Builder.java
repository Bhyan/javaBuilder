package br.ufrn.imd;

public interface Builder {
    void setTipo(Tipo type);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorBordo(ComputadorBordo computadorBordo);
    void setGPS(GPS gps);
}
