package TrabajosPracticosAula.SistemaPoliformicoDeGestionDeFlotaLogistica;

// Superclase: concentra los datos y la lógica comunes de toda la flota
    
public class Vehiculo {
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    // Constructor canónico: inicializa todos los atributos
    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    // Tarifa base: las subclases la sobrescriben (sobrescritura, tiempo de ejecución)
    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * costoBaseKm;
    }

    // Sobrecarga: mismo nombre, distinta lista de parámetros (tiempo de compilación).
    // Invoca la versión de un parámetro, así respeta la tarifa de cada subclase.
    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    public void mostrarFicha() {
        System.out.println("[Vehículo] Genérico | Patente: " + patente + " | Marca: " + marca);
    }
}