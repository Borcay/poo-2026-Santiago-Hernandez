# Santiago Hernandez Diaz 20252578001
# EJERCICIO 1A – Completa el método subir_nivel()
# Agrega un método subirNivel() / subir_nivel() a Personaje que incremente
# nivel en 1 y aumente hp en 10. Luego recorre el vector y llama al método
# sobre cada personaje cuyo nivel sea menor a 10.
# Completa los espacios en blanco: 
def subir_nivel(self):
    self.nivel += 1
    self.hp += 10

for p in equipo:
    if p is not None and p.nivel < 10:
        p.subir_nivel()


# EJERCICIO 2A – Completa el método contar_personajes()
# Escribe un método que recorra el tablero y retorne cuántas celdas
# tienen un Personaje (distinto de null/None). Completa los espacios:  
def contar_personajes(tablero):
    return sum(1 for fila in tablero 
        for celda in fila
            if celda is not None)


# EJERCICIO 3A – Completa el método total_hp_gremio()
# Escribe código que recorra la lista gremio y calcule la suma de HP de todos los 
# personajes con estado 'activo'. Completa los espacios en blanco: 
total_hp = sum(p.hp for p in gremio if p.estado == 'activo')
print(f'HP total activos: {total_hp}')


# EJERCICIO 4A – Completa el código del Iterator
# Usa un Iterator para recorrer la lista y cambiar el estado a 'inactivo'
# de todos los personajes con nivel < 5. Completa los espacios en blanco: */
for p in gremio:  # seguro si solo MODIFICAMOS, no eliminamos
    if p.nivel < 5:
        p.estado = 'inactivo'
        print(f'Inactivado: {p.nombre}')


#  EJERCICIO 5
# Crea la clase Principal (Java) o una celda final (Python) que:
# 1. Cree un GremioRPG con el nombre de tu elección.
# 2. Instancie 8 Personajes con nombres de tu RPG favorito.
# 3. Llame a unirseAlEquipo() para los 8 (el equipo solo tiene 6 slots).
# 4. Coloque 4 personajes en el dungeon en posiciones a tu elección.
# 5. Simule una batalla: pon hp=0 a dos personajes.
# 6. Llame a limpiarCaidos() y verifique que desaparecieron.
# 7. Muestre el reporteGremio() final.

g = GremioRPG('Dinosaurios')

p1 = Personaje('Jacinta', 3, 64)
p2 = Personaje('Pepito', 10, 99)
p3 = Personaje('Pedrito', 55, 929)
p4 = Personaje('Manoolo', 34, 939)
p5 = Personaje('Nolan', 29, 142)
p6 = Personaje('Mark', 1, 2)
p7 = Personaje('Keitt', 120, 33552)
p8 = Personaje('Luisa', 6, 32)

g.unirse_al_equipo(p1)
g.unirse_al_equipo(p2)
g.unirse_al_equipo(p3)
g.unirse_al_equipo(p4)
g.unirse_al_equipo(p5)
g.unirse_al_equipo(p6)
g.unirse_al_equipo(p7)
g.unirse_al_equipo(p8)

p1.setHp(0)
p2.setHp(0)

g.limpiar_caidos()
g.reporte_gremio()