package Practica_uno.Clases_objetos;

public class Main {
    public static void main(String[] args){
        Persona p1= new Persona("Ana", 20);
        Persona p2= new Persona("Luis", 25);
        p1.presentarse();
        p2.presentarse();

        p1.cumplirAnios();
        p1.presentarse();

        p2.setEdad(-5);
        System.out.println(p2.getNombre() + " sigue con " + p2.getEdad() + " años.");
        
        Persona p3 = p1;
        p3.setEdad(40);
        System.out.println(p1.getNombre() + " ahora tiene " + p1.getEdad() + 
    " anios. ");
    }
}
