class Camion extends Vehiculo{
    private int capacidadCarga;
    private int numEjes;
    private String tipoCombustible;

    public Camion(String marca, String modelo, int ano, double precio, int capacidadCarga, int numEjes, String tipoCombustible){
        super(marca, modelo, ano, precio);
        this.capacidadCarga=capacidadCarga;
        this.numEjes=numEjes;
        this.tipoCombustible=tipoCombustible;
    }

    public int getCapacidadCarga(){return capacidadCarga; }
    public void setCapacidadCarga(int capacidadCarga) {this.capacidadCarga=capacidadCarga;}

    public int getNumEjes(){return numEjes; }
    public void setNumEjes(int numEjes) {this.numEjes=numEjes;}

    public String getTipoCombustible(){return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) {this.tipoCombustible=tipoCombustible;}

    @Override
    public void acelerar() {
        System.out.println("El camion está acelerando.");
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.10;
    }

    @Override
    public void detener(){
        System.out.println("El camion esta parado");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("Numero de ejes: " + numEjes);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    public void cargar() {
        System.out.println("El camion esta siendo cargado.");
    }

    public void descargar() {
        System.out.println("El camion esta siendo descargado.");
    }
}