import sys,pygame

class PoolDeCarta(object):
    def __init__(self):
        self.cartas = []
        self.instancia = None
    
    def obtenerInstancia(self):
        for i in range(0,5):
            m = Carta()
            self.cartas.append(m)
    
    def obtenerObjeto(self):
        o = None
        for i in range (0,5):
            if self.cartas[i].estado:
                o = self.cartas[i]
                self.cartas[i].estado = False
                break
        if o == None:
            print("No hay nada gei")
        else:
            self.instancia = o
            return self.instancia

class Carta(object):
    
    def __init__(self):
        self.imagen = pygame.image.load("kuri.jpg")
        self.fondo = pygame.image.load("borrador.jpg")
        self.estado = True
    
    def habilitar(self):
        self.estado = True
        

class Juego(object):
    
    def __init__(self):
        pygame.init()
        self.pool = PoolDeCarta()
        self.pool.obtenerInstancia()
        self.tamaño = width, height = 1270, 720
        
        
    
    
    def iniciar(self):  
        ventana = pygame.display.set_mode(self.tamaño)
        while 1:
            for event in pygame.event.get():
                if event.type == pygame.QUIT: sys.exit() 
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_UP:
                        self.pool.obtenerObjeto()
                        for i in range(0,5):
                                j = (i-4)*-1
                                if(self.pool.cartas[j].estado == False):
                                    img = self.pool.cartas[j].imagen
                                    ventana.blit(img,((i*254)+50,320))
                                    pygame.display.update()
                                    break
                    if event.key == pygame.K_DOWN:
                        if (self.pool.cartas[0].estado):
                           print("No hay cartas que quitar") 
                        else:
                            for i in range (0,5):
                                j = (i-4)*-1
                                if(self.pool.cartas[j].estado == False):
                                    img = self.pool.cartas[j].fondo
                                    ventana.blit(img,((i*254)+50,320))
                                    pygame.display.update()
                                    self.pool.cartas[j].estado = True
                                    break       
        pygame.display.flip()
                               

j = Juego()
j.iniciar()                          
        
            
            
            
            
    
    