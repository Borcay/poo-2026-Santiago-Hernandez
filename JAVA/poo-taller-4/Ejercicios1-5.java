/* Santiago Hernandez Diaz 20252578001
EJERCICIO 1A – Completa el método subir_nivel()
Agrega un método subirNivel() / subir_nivel() a Personaje que incremente
nivel en 1 y aumente hp en 10. Luego recorre el vector y llama al método
sobre cada personaje cuyo nivel sea menor a 10.
Completa los espacios en blanco: */
public void subirNivel() {
    this.nivel = this.nivel + 1;
    this.hp += 10;
}
// Recorrido:
for (int i = 0; i < equipo.length; i++) {
    if (equipo[i] != null && equipo[i].getNivel() < 10) {
        equipo[i].subirNivel();
    }
}


/* EJERCICIO 2A – Completa el método contar_personajes()
Escribe un método que recorra el tablero y retorne cuántas celdas
tienen un Personaje (distinto de null/None). Completa los espacios:  */
public static int contarPersonajes(Personaje[][] tablero) {
    int contador = 0;
    for (int f = 0; f < tablero.length; f++) {
        for (int c = 0; c < tablero[f].length; c++) {
            if (tablero[f][c] != null) {
                contador++;
            }
        }
    }
    return contador;
}


/* EJERCICIO 3A – Completa el método total_hp_gremio()
Escribe código que recorra la lista gremio y calcule la suma de HP de todos los 
personajes con estado 'activo'. Completa los espacios en blanco: */
int totalHP = 0;
for (Personaje p : gremio) {
    if (p.getEstado().equals("activo")) {
        totalHP += p.getHp();
    }
}
System.out.println("HP total activos: " + totalHP);


/* EJERCICIO 4A – Completa el código del Iterator
Usa un Iterator para recorrer la lista y cambiar el estado a 'inactivo'
de todos los personajes con nivel < 5. Completa los espacios en blanco: */
Iterator<Personaje> it = gremio.iterator();
while (it.hasNext()) {
    Personaje p = it.next();
    if (p.getNivel() < 5) {
        p.setEstado("inactivo");
        System.out.println("Inactivado: " + p.getNombre());
    }
}


/* EJERCICIO 5
Crea la clase Principal (Java) o una celda final (Python) que:
1. Cree un GremioRPG con el nombre de tu elección.
2. Instancie 8 Personajes con nombres de tu RPG favorito.
3. Llame a unirseAlEquipo() para los 8 (el equipo solo tiene 6 slots).
4. Coloque 4 personajes en el dungeon en posiciones a tu elección.
5. Simule una batalla: pon hp=0 a dos personajes.
6. Llame a limpiarCaidos() y verifique que desaparecieron.
7. Muestre el reporteGremio() final.*/

GremioRPG g = new GremioRPG("Dinosaurios");

Personaje p1 = new Personaje("Jacinta", 3, 64);
Personaje p2 = new Personaje("Pepito", 10, 99);
Personaje p3 = new Personaje("Pedrito", 55, 929);
Personaje p4 = new Personaje("Manolo", 34, 939);
Personaje p5 = new Personaje("Nolan", 29, 142);
Personaje p6 = new Personaje("Mark", 1, 2);
Personaje p7 = new Personaje("Keitt", 120, 33552);
Personaje p8 = new Personaje("Luisa", 6, 32);


g.unirseAlEquipo(p1); 
g.unirseAlEquipo(p2); 
g.unirseAlEquipo(p3); 
g.unirseAlEquipo(p4); 
g.unirseAlEquipo(p5); 
g.unirseAlEquipo(p6); 
g.unirseAlEquipo(p7); 
g.unirseAlEquipo(p8); 

g.colocarEnDungeon(p1, 0, 0);
g.colocarEnDungeon(p2, 1, 0);
g.colocarEnDungeon(p3, 0, 1);
g.colocarEnDungeon(p4, 1, 1);

p1.setHp(0);
p2.setHp(0);

g.limpiarCaidos();
g.reporteGremio();