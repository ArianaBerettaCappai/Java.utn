package TrabajosPracticosAula.SistemaPoliformicoDeGestionDeFlotaLogistica;

public class Furgoneta extends Vehiculo {
    private final boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    // Recargo fijo de $5000 por cadena de frío
    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = distanciaKm * costoBaseKm;
        if (tieneRefrigeracion) {
            costo += 5000;
        }
        return costo;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] Furgoneta | Patente: " + patente + " | Marca: " + marca
                + " | Refrigerado: " + (tieneRefrigeracion ? "Sí" : "No"));
    }
}