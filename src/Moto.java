class Moto extends Vehiculo{
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int ano, double precio, int cilindrada, String tipoMotor){
        super(marca, modelo, ano, precio);
        this.cilindrada=cilindrada;
        this.tipoMotor=tipoMotor;
    }

    public int getCilindrada(){return cilindrada; }
    public void setCilindrada(int cilindrada) {this.cilindrada=cilindrada;}

    public String getTipoMotor(){return tipoMotor; }
    public void setTipoMotor(String tipoMotor) {this.tipoMotor=tipoMotor;}

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.10;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo motor: " + tipoMotor);
    }
    public void hacerCaballito() {
        System.out.println("Haciendo un caballito");
    }


}
