class Estudiante:
    # Constructor - se ejecuta al crear un objeto
    def __init__(self, nombre, edad, carrera):
        self.nombre = nombre
        self.edad = edad
        self.carrera = carrera
        self.materias = []

    # Método para agregar materias
    def inscribir_materia(self, materia):
        self.materias.append(materia)
        print(f'{self.nombre} se inscribió en {materia}')

    # Método para mostrar información
    def presentarse(self):
        print(f'Hola, soy {self.nombre}')
        print(f'Tengo {self.edad} años')
        print(f'Estudio {self.carrera}')
        print(f'Materias inscritas: {len(self.materias)}')
        
        
    def estudiar(self, horas): 
        print(f'{self.nombre} estudió {horas} horas')

# --- Crear objetos (instancias de la clase) ---

estudiante1 = Estudiante('Santiago Hernandez', 21, 'Tec. Sist. de datos')

# --- Usar los métodos ---

estudiante1.presentarse()
print('---')
estudiante1.inscribir_materia('POO')
estudiante1.inscribir_materia('Calculo Integral')
estudiante1.inscribir_materia('Fisica Newtoniana')
print('---')
estudiante1.estudiar(5)


