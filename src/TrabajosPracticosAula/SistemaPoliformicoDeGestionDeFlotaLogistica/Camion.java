package TrabajosPracticosAula.SistemaPoliformicoDeGestionDeFlotaLogistica;

public class Camion extends Vehiculo {
    private final double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);   // primera línea: delega en la superclase
        this.capacidadToneladas = capacidadToneladas;
    }

    // Recargo del 5% por cada tonelada de capacidad
    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * (1 + capacidadToneladas * 0.05);
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] Camión | Patente: " + patente + " | Marca: " + marca
                + " | Toneladas: " + capacidadToneladas);
    }
}