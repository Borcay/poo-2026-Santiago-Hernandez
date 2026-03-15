class Animal:
        
    def sonido(self):
        print("El animal hace un sonido")
        
class Perro(Animal):
    def sonido(self):
        print("Guau Guau")
        
        
class Gato(Animal):
    def sonido(self):
        print("Miau Miau")
        
        
class Vaca(Animal):
    def sonido(self):
        print("Muu Muu")
        
        
class Conejo(Animal):
    def sonido(self):
        print("No hago sonidos")
        
        

mi_perro = Perro()
mi_gato = Gato()
mi_vaca = Vaca()
mi_conejo = Conejo()
mi_perro.sonido()
mi_gato.sonido()
mi_vaca.sonido()
mi_conejo.sonido()