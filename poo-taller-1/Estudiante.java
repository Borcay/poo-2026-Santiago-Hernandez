import java.util.ArrayList;

public class Estudiante {
    // Atributos privados (encapsulación)
    private String nombre;
    private int edad;
    private String carrera;
    private ArrayList<String> materias;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

    // Método para inscribir materia
    public void inscribirMateria(String materia) {
        this.materias.add(materia);
        System.out.println(nombre + " se inscribió en " + materia);
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Estudio " + carrera);
        System.out.println("Materias inscritas: " + materias.size());
    }

    //Metodo para estudiar
    public void estudiar(int horas) { 
        System.out.println(nombre + " estudió " + horas + " horas"); 
    } 

    // Método main para probar
    public static void main(String[] args) {
        // Crear objetos
        Estudiante est3 = new Estudiante("Santiago Hernandez", 21, "Tec. Sist. Datos");

        // Usar métodos
        System.out.println("---");
        est3.inscribirMateria("POO");
        est3.inscribirMateria("Calculo 2");
        est3.inscribirMateria("Estructuras de datos");
        est3.inscribirMateria("Textos 2");
        est3.inscribirMateria("Fisica 1");
        est3.inscribirMateria("Catedra contexto");
        est3.presentarse();
        est3.estudiar(10);
    }
}