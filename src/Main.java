public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 2020, 15000, 4, "Automática", true);
        Moto moto = new Moto("Yamaha", "R3", 2021, 8000, 321, "4 tiempos");
        Camion camion = new Camion("Volvo", "FH", 2018, 45000, 18, 3, "Diesel");

        System.out.println("--- Automóvil ---");
        auto.mostrarInfo();
        auto.arrancar();
        auto.acelerar();
        auto.encenderAire();
        System.out.println("Impuesto: €" + auto.calcularImpuesto());

        System.out.println("\n--- Moto ---");
        moto.mostrarInfo();
        moto.arrancar();
        moto.acelerar();
        moto.hacerCaballito();
        System.out.println("Impuesto: €" + moto.calcularImpuesto());

        System.out.println("\n--- Camión ---");
        camion.mostrarInfo();
        camion.arrancar();
        camion.acelerar();
        camion.detener();
        camion.cargar();
        camion.descargar();
        System.out.println("Impuesto: €" + camion.calcularImpuesto());
    }
}