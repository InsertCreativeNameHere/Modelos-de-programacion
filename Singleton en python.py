import threading

class Singleton(object):
    singleton = None
    
    def __new__(self):
        if(self.singleton is None):
            self.singleton = object.__new__(self)
        return self.singleton


class Prueba(Singleton):
    
    def __new__(self):
        return super(Prueba, self).__new__(self);
    
    def setNombre(self,nombre):
        self.nombre = nombre
        
    def setApellido(self,apellido):
        self.apellido = apellido

    def imprimirNombre(self):
        print((self.nombre)*50)
    
    def imprimirApellido(self):
        evento.wait()
        print((self.apellido)*50)


c = Prueba()
d = Prueba()
f = Prueba()
c.setApellido("Torres")
c.setNombre("Marcos")
d.setApellido("Martinez")
d.setNombre("Juan")
f.setApellido("Dasdas")
f.setNombre("Brayan")

evento = threading.Event()
hilo = threading.Thread(name="nombres", target=c.imprimirApellido)
hilo.start()
print("Voy a imprimir nombres")
c.imprimirNombre()
print("Termine de imprimir nombres")
evento.set()
