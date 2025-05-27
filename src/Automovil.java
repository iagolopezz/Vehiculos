class Automovil extends Vehiculo {
    private int numPuertas;
    private String tipoTransmision;
    private boolean tieneAireAcondicionado;

    public Automovil(String marca, String modelo, int ano, double precio, int numPuertas, String tipoTransmision, boolean tieneAireAcondicionado) {
        super(marca, modelo, ano, precio);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public int getNumPuertas(){return numPuertas; }
    public void setNumPuertas(int numPuertas) {this.numPuertas=numPuertas;}

    public String getTipoTransmision(){return tipoTransmision; }
    public void setTipoTransmision(String tipoTransmision) {this.tipoTransmision=tipoTransmision;}

    public boolean getTieneAireAcondicionado(){return tieneAireAcondicionado; }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {this.tieneAireAcondicionado=tieneAireAcondicionado;}


    @Override
    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.10;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Transmision: " + tipoTransmision);
        System.out.println("Aire acondicionado: " + (tieneAireAcondicionado ? "Si" : "No"));
    }

    public void encenderAire() {
        if (tieneAireAcondicionado) {
            System.out.println("Aire acondicionado encendido.");
        } else {
            System.out.println("Este automovil no tiene aire acondicionado.");
        }
    }


}
