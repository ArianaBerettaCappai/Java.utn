package PracticaUno.ClasesObjetos;
//ejemplo:
/**
 * Programa corto con una clase Persona y un main que crea
 * objetos y los usa.
 * Clase: Persona con atributos private (encapsulamiento) y metodos
 * Constructor: Persona(String nombre, int edad) inicializa el objeto
 * al hacer new.
 * Objetos p1 y p2 son dos instancias independientes, cada una con su 
 * propio estado (nombre y edad).
 * Metodos: presentarse() y cumplirAnios() son el comportamiento;
 * setEdad incluye una validación.
 * Referencias: p3 = p1 copia la direccion/referencia, no el objeto,
 * asi que cambiar p3 cambia a p1.
 */
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        if (nuevaEdad >= 0){
            this.edad = nuevaEdad;
        }
    }

    public void presentarse(){
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public void cumplirAnios(){
        edad++;
    }
}
