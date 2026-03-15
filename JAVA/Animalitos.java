class Animalitos {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animalitos {
    public void sonido() {
        System.out.println("Guau Guau");
    }
}

class Gato extends Animalitos {
    public void sonido() {
        System.out.println("Miau Miau");
    }
}

class Vaca extends Animalitos {
    public void sonido() {
        System.out.println("Muu Muu");
    }
}

class Conejo extends Animalitos {
    public void sonido() {
        System.out.println("No hago sonidos");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        Gato miGato = new Gato();
        Vaca miVaca = new Vaca();
        Conejo miConejo = new Conejo();

        miPerro.sonido();
        miGato.sonido();
        miVaca.sonido();
        miConejo.sonido();
    }
}