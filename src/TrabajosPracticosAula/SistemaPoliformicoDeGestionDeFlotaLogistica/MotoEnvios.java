package TrabajosPracticosAula.SistemaPoliformicoDeGestionDeFlotaLogistica;
public class MotoEnvios extends Vehiculo {

    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    // Descuento del 15% por transporte liviano
    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * 0.85;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] MotoEnvios | Patente: " + patente + " | Marca: " + marca
                + " | Mensajería liviana");
    }
}