package modelo;

public class motocicleta extends Vehiculo {

    private final String cilindrada;

    public motocicleta(String marca, String modelo, int anio,
                       double precio, String cilindrada) {

        super(marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    protected String getCaracteristica() {
        return "Cilindrada: " + cilindrada;
    }
}