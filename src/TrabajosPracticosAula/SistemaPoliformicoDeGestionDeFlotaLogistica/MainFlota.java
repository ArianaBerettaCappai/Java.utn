package TrabajosPracticosAula.SistemaPoliformicoDeGestionDeFlotaLogistica;

public class MainFlota {
    public static void main(String[] args) {
        // Arreglo polimórfico: tipo Vehiculo, objetos de distintas subclases
        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = new Camion("AA123BB", "Scania", 450.0, 18.0);
        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz", 416.0, true);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        double distancia = 150.0;
        double total = 0;

        System.out.println("=== Reporte de Operaciones de Flota ===");
        for (Vehiculo v : flota) {
            v.mostrarFicha();                                   // despacho dinámico
            double costo = v.calcularCostoViaje(distancia);     // sin if ni instanceof
            System.out.println("Costo de viaje (" + distancia + " km): $" + costo);
            System.out.println("--------------------------------------------------");
            total += costo;
        }
        System.out.println("Costo total operativo de la flota: $" + total);

        // Demostración de la sobrecarga: la misma tarifa más $3000 de peajes
        System.out.println("Moto con peajes: $" + flota[2].calcularCostoViaje(distancia, 3000.0));
    }
}