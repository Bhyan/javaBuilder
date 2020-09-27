package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarroBuilder builder = new CarroBuilder();
        director.construtorCarroEsporte(builder);

        Carro car = builder.getResult();
        System.out.println("Carro construído:\n" + car.getTipo());

        CarroManualBuilder manualBuilder = new CarroManualBuilder();

        director.construtorCarroEsporte(manualBuilder);
        Manual carroManual = manualBuilder.getResult();
        System.out.println("\nCarro Manual construído:\n" + carroManual.print());
    }
}
