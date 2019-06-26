class Carro:
    
    def __init__(self,color,marca):
       self.color = color
       self.marca = marca

class Iterador:
    
    posicion = 0 
    
    def avanzar(cls,array):
        cls.posicion = cls.posicion + 1
        if(cls.posicion < len(array)):
            print(cls.posicion)
            print("Avanze: ",array[cls.posicion].color," ",array[cls.posicion].marca)
        else:
            cls.posicion = cls.posicion - 1
            print("He llegado al limite del arreglo \n")
    
    def retroceder(cls,array):
        if(cls.posicion >= 1):
            cls.posicion = cls.posicion - 1;
            print("Retrocedi: ",array[cls.posicion].color," ",array[cls.posicion].marca)
        else:
            print("He llegado al limite del arreglo \n")
    
class Launcher:
    
    def main():
        array = []
        i = True
        while(i):
             print("La posicion actual es: ", Iterador.posicion)
             op = input("Seleccione una opcion (1:agregar objeto, 2: avanzar, 3: retroceder,Otro: salir) \n")
             if(op == "1"):
                 color=  input("Introdusca el color \n")
                 marca = input ("Introdusca la marca \n")
                 auto = Carro(color,marca)
                 array.append(auto)
             elif(op == "2"):
                 Iterador.avanzar(Iterador,array)
             elif(op == "3"):
                 Iterador.retroceder(Iterador,array)
             else:
                 i = False
    main()