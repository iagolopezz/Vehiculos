public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precio;

    public Vehiculo(String marca, String modelo, int ano, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.precio=precio;
    }

    public String getMarca(){return marca; }
    public void setMarca(String marca) {this.marca=marca;}

    public String getModelo(){return modelo; }
    public void setModelo(String modelo) {this.modelo=modelo;}

    public int getAno(){return ano; }
    public void setAno(int ano) {this.ano=ano;}

    public double getPrecio(){return precio; }
    public void setPrecio(double precio) {this.precio=precio; }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Año:" + ano);
        System.out.println("Precio" + precio);
    }

    public void arrancar(){
        System.out.println("El vehiculo está arrancando...");
    }

    public void detener(){
        System.out.println("El vehiculo esta parado");
    }

    public abstract void acelerar();
    public abstract double calcularImpuesto();

}
