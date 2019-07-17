#Beta de Eyefender
import pygame
import random
from os  import path

img_dir = path.join(path.dirname(__file__),'img')
snd_dir = path.join(path.dirname(__file__),'snd')

WIDTH = 480
HEIGHT = 600
FPS = 60
POWERUP_TIME = 4000 

#definicion de colores 
WHITE = (255,255,255)
BLACK = (0,0,0)
RED = (255,0,0)
GREEN = (0,255,0)
BLUE = (0,0,255)
YELLOW = (255, 255, 0)
ORANGE = (255,69,0)

#iniciar pygame y crear ventana
pygame.init()
pygame.mixer.init()
pantalla = pygame.display.set_mode((WIDTH,HEIGHT))
pygame.display.set_caption("EyeFender!")
reloj = pygame.time.Clock()

font_name = pygame.font.match_font('arial')

def draw_text(surf, text, size, x, y):
    font = pygame.font.Font(font_name, size)
    text_surface = font.render(text, True, WHITE)
    text_rect = text_surface.get_rect()
    text_rect.midtop = (x,y)
    surf.blit(text_surface, text_rect)
   
def evaluarLifepoints(pct):
    if pct <= 50:
        jugador.image = pygame.transform.scale(jugadorHurt_img, (40,40))
        jugador.image.set_colorkey(BLACK)
    elif pct > 50:
        jugador.image = pygame.transform.scale(jugador_img, (40,40))
        jugador.image.set_colorkey(BLACK)
            
                 
    
def nuevoEmgo():#crea un objeto de tipo enemigo
    e = Enemigo()
    Sprites.add(e)
    enemigos.add(e)  
    
def nuevoEmgo2():
    e = Enemigo2()
    Sprites.add(e)
    enemigos2.add(e)
    
def draw_lifepoints(surf,x,y,pct):
    if pct < 0:
        pct=0
    bar_length = 100
    bar_height = 10
    fill = (pct/100)*bar_length
    outline_rect = pygame.Rect(x,y,bar_length,bar_height)
    fill_rect = pygame.Rect(x,y,fill,bar_height)
    if pct <= 100 and pct >=50:
        pygame.draw.rect(surf, GREEN, fill_rect)
    elif pct>=25 and pct <50:
        pygame.draw.rect(surf, ORANGE, fill_rect)
    elif pct<25 and pct>0:
        pygame.draw.rect(surf, RED, fill_rect)      
    pygame.draw.rect(surf, WHITE, outline_rect, 2)
    
def draw_lives(surf,x,y,lives,img):
    for i in range (lives):
        img_rect = img.get_rect()
        img_rect.x = x + 30 * i
        img_rect.y = y
        surf.blit(img, img_rect)

#Fabricas
        
class FabricaAbstracta():
    
    def crearSonido(self):
        pass
    
    def crearSprite(self):
        pass
    
    def crearStats(self):
        pass

    
class FabricaPestaña(FabricaAbstracta):
    
    sprite = None
    sonido = None
    stats = None
    
    def __init__(self):
        self.crearSonido
        self.crearSprite
        self.crearStats
    
    
    def crearSprite(self):
        self.sprite = SpritePestaña();
    
    def crearStats(self):
        self.stats = StatsPestaña();
    
    def crearSonido(self):
        self.sonido = SonidoPestaña();
    
    
class FabricaShampoo(FabricaAbstracta):
    
    sprite = None
    sonido = None
    stats = None
    
    def __init__(self):
        self.crearSonido
        self.crearSprite
        self.crearStats
    
    
    def crearSprite(self):
        self.sprite = SpriteShampoo();
    
    def crearStats(self):
        self.stats = StatsShampoo();
    
    def crearSonido(self):
        self.sonido = SonidoShampoo();
    
class FabricaConjuntivitis(FabricaAbstracta):
    
    sprite = None
    sonido = None
    stats = None
    
    def __init__(self):
        self.crearSonido
        self.crearSprite
        self.crearStats
    
    
    def crearSprite(self):
        self.sprite = SpriteConjuntivitis();
    
    def crearStats(self):
        self.stats = StatsConjuntivitis();
    
    def crearSonido(self):
        self.sonido = SonidoConjuntivitis();
    

class FabricaJugador(FabricaAbstracta):
    
    sprite = None
    sonido = None
    stats = None
    
    def __init__(self):
        self.crearSonido
        self.crearSprite
        self.crearStats
    
    
    def crearSprite(self):
        self.sprite = SpriteJugador();
    
    def crearStats(self):
        self.stats = StatsJugador();
    
    def crearSonido(self):
        self.sonido = SonidoJugador();
      
class FabricaDisparo(FabricaAbstracta):
    
    sprite = None
    
    stats = None
    
    def __init__(self):        
        self.crearSprite
        self.crearStats    
    
    def crearSprite(self):
        self.sprite = SpriteDisparo();
    
    def crearStats(self):
        self.stats = StatsDisparo();
    
            

class FabricaPowerUp(FabricaAbstracta):
    
    sprite = None
    sonido = None
    stats = None
    
    def __init__(self):
        self.crearSonido
        self.crearSprite
        self.crearStats
    
    
    def crearSprite(self):
        self.sprite = SpritePowerUp();
    
    def crearStats(self):
        self.stats = StatsPowerUp();
    
    def crearSonido(self):
        self.sonido = SonidoPowerUp();
    
#Fabricas de Sprite
class Sprite(pygame.sprite.Sprite):
    
    image = None;
    rect = None;
    radius = None;
    
    def __init__(self):
        pass
    
    def getImage(self):
        pass
    
    def getRect(self):
        pass
    
    def getRadius(self):
        pass

class SpritePestaña(Sprite):
    
    
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = random.choice(enemigo_images)
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)

class SpriteConjuntivitis(Sprite):
    
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = random.choice(enemigo2_images)
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)

class SpriteShampoo(Sprite):
    
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = random.choice(enemigo2_images) #Cambiar sprite y esas cosas por los correctos xD
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)
        
class SpritePowerUp(Sprite):
    def __init__(self,center):
      pygame.sprite.Sprite.__init__(self)
      self.type = random.choice(['lifeUp','powerUp'])
      self.image = powerup_images[self.type]
      self.image.set_colorkey(BLACK)
      self.rect = self.image.get_rect()
      self.rect.center = center

class SpriteJugador(Sprite):
    
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = pygame.transform.scale(jugador_img, (40,40)) 
        self.image.set_colorkey(BLACK)       
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)
        
class SpriteDisparo(Sprite):
    def __init__(self,x,y):
        pygame.sprite.Sprite.__init__(self)
        self.image = pygame.transform.scale(disparo_img, (25,45)) 
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.rect.bottom = y;
        self.rect.centerx = x;
        
            
#Fabricas de sonido
class Sonido():
    
    muerte_sound = None
    
    def __init__(self):
        pass

class SonidoPestaña(Sonido):
    
    def __init__(self):
        
        self.muerte_sound = pygame.mixer.Sound(path.join(snd_dir, 'Muerte.wav'))
        self.muerte_sound.set_volume(0.2)
        
class SonidoShampoo(Sonido):
    
    def __init__(self):
        
        self.muerte_sound = pygame.mixer.Sound(path.join(snd_dir, 'Muerte.wav'))
        self.muerte_sound.set_volume(0.2)

class SonidoConjuntivitis(Sonido):
    
    def __init__(self):
        
        self.muerte_sound = pygame.mixer.Sound(path.join(snd_dir, 'Muerte2.wav'))
        self.muerte_sound.set_volume(0.2)
        
class SonidoJugador(Sonido):
    
    disparo_sound = None
    
    def __init__(self):
        self.muerte_sound = pygame.mixer.Sound(path.join(snd_dir, 'MuerteJugador.wav'))
        self.muerte_sound.set_volume(1)
        self.disparo_sound = pygame.mixer.Sound(path.join(snd_dir, 'Disparo.wav'))
        self.disparo_sound.set_volume(0.2)
        
class SonidoPowerUp(Sonido):
    def __init__(self):
        self.lifeUp_sound = pygame.mixer.Sound(path.join(snd_dir, 'lifeUp.wav'))
        self.lifeUp_sound.set_volume(0.5)
        self.powerUp_sound = pygame.mixer.Sound(path.join(snd_dir, 'powerUp.wav'))
        self.powerUp_sound.set_volume(0.9)
    
#Fabricas de stats
        
class Stats():
    
    speedy = None
    speedx = None
    def __init__(self):
        pass

class StatsPestaña(Stats):
    
    def __init__(self):
        self.speedy = random.randrange(1,8)
        self.speedx = random.randrange(-3,3)

class StatsShampoo(Stats): #editar esto xd
    
    def __init__(self):
        self.speedy = random.randrange(1,8)
        self.speedx = random.randrange(-3,3)

class StatsConjuntivitis(Stats):
    
    def __init__(self):
        self.speedy = random.randrange(12,14)
        self.speedx = random.randrange(-4,4)

class StatsJugador(Stats):
    
    def __init__(self):
        self.rect.centerx = WIDTH/2
        self.rect.bottom = HEIGHT - 10
        self.speedx = 0
        self.lifepoints = 100        
        self.shoot_delay = 400
        self.last_shot = pygame.time.get_ticks()
        self.lives = 3
        self.hidden = False
        self.hide_timer = pygame.time.get_ticks()
        self.power = 1 #nivel de poder, esto controla cuantas balas puede disparar
        self.power_timer = pygame.time.get_ticks()

class StatsPowerUp(Stats):
    
    def __init__(self):
        self.speedy = 3

class StatsDisparo(Stats):
    def __init__(self):
        self.speedy = -10

#Builder   
    
        
class Enemy():
    
    sprite = None;
    sonido = None;
    stats = None;
    
    def __init__(self):
        pass
    
    def update(self):
        self.rect.x += self.stats.speedx
        self.rect.y += self.stats.speedy
        #Esto es para que cuando lleguen a la parte de abajo de la pantalla vuelvan arriba
        #El or es para controlar que los enemigos no se vayan a los costados
        if self.rect.top > HEIGHT + 10 or self.rect.left < -25 or self.rect.right > WIDTH + 20:
            self.rect.x = random.randrange (WIDTH - self.rect.width) #spawn aleatorio en x
            self.rect.y = random.randrange(-100,-40)
            self.stats.speedy = random.randrange(1,8)
        
class Player():
    
    sprite = None;
    sonido = None;
    stats = None;
    
    def __init__(self):  
        pass
        
    def update(self):
        #cuando el tiempo de powerup se acaba
        if self.stats.power>=2 and pygame.time.get_ticks() - self.stats.power_time > POWERUP_TIME:
            self.stats.power -= 1
            self.stats.power_time = pygame.time.get_ticks()
        #unhide if hidden
        if self.stats.hidden and pygame.time.get_ticks() - self.stats.hide_timer > 1000:
            self.stats.hidden = False
            self.sprite.rect.centerx = WIDTH/2
            self.sprite.rect.bottom = HEIGHT - 10
            self.sprite.image = pygame.transform.scale(jugador_img, (40,40))
            self.sprite.image.set_colorkey(BLACK)
            
        self.stats.speedx=0
        tecla_presionada = pygame.key.get_pressed()
        if tecla_presionada[pygame.K_LEFT]:
            self.stats.speedx = -5
        if tecla_presionada[pygame.K_RIGHT]:
            self.stats.speedx = 5
        if tecla_presionada[pygame.K_SPACE]:
            self.disparar()
        self.rect.x += self.speedx     
        #aqui hago que la pantalla funcione como una pared para el jugador
        if self.rect.right > WIDTH:
            self.rect.right = WIDTH
        if self.rect.left < 0:
            self.rect.left = 0
       
    def powerup(self):
        self.power += 1
        self.power_time = pygame.time.get_ticks()
        
    def disparar(self):
        now = pygame.time.get_ticks()
        if now -self.stats.last_shot > self.stats.shoot_delay:
            self.stats.last_shot = now
            if self.power==1:                
                disparo = Disparo(self.sprite.rect.centerx, self.sprite.rect.top)
                Sprites.add(disparo)
                disparos.add(disparo)
                self.sonido.disparo_sound.play()         
            if self.power >= 2:
                disparo1 = Disparo(self.sprite.rect.left, self.sprite.rect.centery)
                disparo2 = Disparo(self.sprite.rect.right, self.sprite.rect.centery)
                Sprites.add(disparo1)
                Sprites.add(disparo2)
                disparos.add(disparo1)
                disparos.add(disparo2)
                self.sonido.disparo_sound.play() 
                
            
    def hide(self):#este metodo esconde al jugador 
        self.stats.hidden = True
        self.stats.hide_timer = pygame.time.get_ticks()
        self.sprite.rect.center = (WIDTH/2, HEIGHT+200)
    


class poderArriba():
    def __init__(self): #ese x,y es la posicion del jugador
        pass
        
    def update(self):
        self.sprite.rect.y += self.stats.speedy
        #si pasa el tope de la pantalla, el objeto debe morir , que sad :c
        if self.sprite.rect.top > HEIGHT:
            self.kill()
class Director():
    

    def __init__(self,esclavo):
        self.constructor = esclavo;
    
    def construirPersonaje(self):
        self.constructor.crearSprite()
        self.constructor.crearSonido()
        self.constructor.crearStats()
    
    def darPersonaje(self):
        return self.constructor.getInstacia()
        

class Constructor():
    
    instancia = None
    fabrica = None
    
    def crearInstancia(self):
        pass
    
    def getInstancia(self):
        return self.instancia
    
    def crearSprite(self):
        pass
    def crearSonido(self):
        pass
    def crearStats(self):
        pass

class ConstructorPestañas(Constructor):
    
    
    
    def __init__(self):
        self.instancia = Enemy();
        self.fabrica = FabricaPestaña()
        
        
    
    def crearSprite(self):
        self.instancia.sprite = self.fabrica.sprite
    
    def crearSonido(self):
        self.instancia.sonido = self.fabrica.sonido
    
    def crearStats(self):
        self.instancia.stats = self.fabrica.stats

class ConstructorShampoo(Constructor):
    
    
    
    def __init__(self):
        self.instancia = Enemy();
        self.fabrica = FabricaShampoo()
        
    
    def crearSprite(self):
        self.instancia.sprite = self.fabrica.sprite
    
    def crearSonido(self):
        self.instancia.sonido = self.fabrica.sonido
    
    def crearStats(self):
        self.instancia.stats = self.fabrica.stats
    
    
class ConstructorConjuntivitis(Constructor):
    
    
    def __init__(self):
        self.instancia = Enemy();
        self.fabrica = FabricaConjuntivitis
        
        
    
    def crearSprite(self):
        self.instancia.sprite = self.fabrica.sprite
    
    def crearSonido(self):
        self.instancia.sonido = self.fabrica.sonido
    
    def crearStats(self):
        self.instancia.stats = self.fabrica.stats

class ConstructorJugador(Constructor):
    
    
    
    def __init__(self):
        self.instancia = Player();
        self.fabrica = FabricaPestaña()
        
    
    def crearSprite(self):
        self.instancia.sprite = self.fabrica.sprite
    
    def crearSonido(self):
        self.instancia.sonido = self.fabrica.sonido
    
    def crearStats(self):
        self.instancia.stats = self.fabrica.stats

class ConstructorPowerUp(Constructor):
    
    
    
    def __init__(self):
        self.instancia = poderArriba();
        self.fabrica = FabricaPestaña()
        
    
    def crearSprite(self):
        self.instancia.sprite = self.fabrica.sprite
    
    def crearSonido(self):
        self.instancia.sonido = self.fabrica.sonido
    
    def crearStats(self):
        self.instancia.stats = self.fabrica.stats
    
    
    


class Jugador(pygame.sprite.Sprite): #crea el sprite del jugador para luego asignarlo al grupo de sprites
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = pygame.transform.scale(jugador_img, (40,40)) 
        self.image.set_colorkey(BLACK)       
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)
        #pygame.draw.circle(self.image, RED, self.rect.center, self.radius)
        self.rect.centerx = WIDTH/2
        self.rect.bottom = HEIGHT - 10
        self.speedx = 0
        self.lifepoints = 100        
        self.shoot_delay = 400
        self.last_shot = pygame.time.get_ticks()
        self.lives = 3
        self.hidden = False
        self.hide_timer = pygame.time.get_ticks()
        self.power = 1 #nivel de poder, esto controla cuantas balas pued e disparar
        self.power_timer = pygame.time.get_ticks()
        
    def update(self):
        #cuando el tiempo de powerup se acaba
        if self.power>=2 and pygame.time.get_ticks() - self.power_time > POWERUP_TIME:
            self.power -= 1
            self.power_time = pygame.time.get_ticks()
        #unhide if hidden
        if self.hidden and pygame.time.get_ticks() - self.hide_timer > 1000:
            self.hidden = False
            self.rect.centerx = WIDTH/2
            self.rect.bottom = HEIGHT - 10
            self.image = pygame.transform.scale(jugador_img, (40,40))
            self.image.set_colorkey(BLACK)
            
        self.speedx=0
        tecla_presionada = pygame.key.get_pressed()
        if tecla_presionada[pygame.K_LEFT]:
            self.speedx = -5
        if tecla_presionada[pygame.K_RIGHT]:
            self.speedx = 5
        if tecla_presionada[pygame.K_SPACE]:
            self.disparar()
        self.rect.x += self.speedx     
        #aqui hago que la pantalla funcione como una pared para el jugador
        if self.rect.right > WIDTH:
            self.rect.right = WIDTH
        if self.rect.left < 0:
            self.rect.left = 0
       
    def powerup(self):
        self.power += 1
        self.power_time = pygame.time.get_ticks()
        
    def disparar(self):#Este metodo controla los disparos, poniendolos en la posicon del jugador
        #y llevandolos a un grupo de sprites
        now = pygame.time.get_ticks()
        if now -self.last_shot > self.shoot_delay:
            self.last_shot = now
            if self.power==1:                
                disparo = Disparo(self.rect.centerx, self.rect.top)
                Sprites.add(disparo)
                disparos.add(disparo)
                laser_sound.play()            
            if self.power >= 2:
                disparo1 = Disparo(self.rect.left, self.rect.centery)
                disparo2 = Disparo(self.rect.right, self.rect.centery)
                Sprites.add(disparo1)
                Sprites.add(disparo2)
                disparos.add(disparo1)
                disparos.add(disparo2)
                laser_sound.play() 
                
            
    def hide(self):#este metodo esconde al jugador 
        self.hidden = True
        self.hide_timer = pygame.time.get_ticks()
        self.rect.center = (WIDTH/2, HEIGHT+200)
            
    
class Enemigo2(pygame.sprite.Sprite):
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = random.choice(enemigo2_images)
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)
        #pygame.draw.circle(self.image, RED, self.rect.center, self.radius)#sirve para ver la hitbox
        self.rect.x = random.randrange (WIDTH - self.rect.width) #spawn aleatorio en x
        self.rect.y = random.randrange(-100,-40)
        #Esta parte controla su movimiento loco XDxDxd
        self.speedy = random.randrange(12,14)
        self.speedx = random.randrange(-4,4)
        
    def update(self):
        self.rect.x += self.speedx
        self.rect.y += self.speedy
        #Esto es para que cuando lleguen a la parte de abajo de la pantalla vuelvan arriba
        #El or es para controlar que los enemigos no se vayan a los costados
        if self.rect.top > HEIGHT + 10 or self.rect.left < -25 or self.rect.right > WIDTH + 20:
            self.rect.x = random.randrange (WIDTH - self.rect.width) #spawn aleatorio en x
            self.rect.y = random.randrange(-100,-40)
            self.speedy = random.randrange(1,8)
        
    
class Enemigo(pygame.sprite.Sprite):
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.image = random.choice(enemigo_images)
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.radius = int(self.rect.width / 2)
        #pygame.draw.circle(self.image, RED, self.rect.center, self.radius)#sirve para ver la hitbox
        self.rect.x = random.randrange (WIDTH - self.rect.width) #spawn aleatorio en x
        self.rect.y = random.randrange(-100,-40)
        #Esta parte controla su movimiento loco XDxDxd
        self.speedy = random.randrange(1,8)
        self.speedx = random.randrange(-3,3)
        
    def update(self):
        self.rect.x += self.speedx
        self.rect.y += self.speedy
        #Esto es para que cuando lleguen a la parte de abajo de la pantalla vuelvan arriba
        #El or es para controlar que los enemigos no se vayan a los costados
        if self.rect.top > HEIGHT + 10 or self.rect.left < -25 or self.rect.right > WIDTH + 20:
            self.rect.x = random.randrange (WIDTH - self.rect.width) #spawn aleatorio en x
            self.rect.y = random.randrange(-100,-40)
            self.speedy = random.randrange(1,8)
                
class Disparo(pygame.sprite.Sprite):
    def __init__(self,x,y): #ese x,y es la posicion del jugador
        pygame.sprite.Sprite.__init__(self)
        self.image = pygame.transform.scale(disparo_img, (25,45)) 
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.rect.bottom = y;
        self.rect.centerx = x;
        self.speedy = -10
        
    def update(self):
        self.rect.y += self.speedy
        #si pasa el tope de la pantalla, el objeto debe morir , que sad :c
        if self.rect.bottom < 0:
            self.kill()
                    

class powerUp(pygame.sprite.Sprite):
    def __init__(self,center): #ese x,y es la posicion del jugador
        pygame.sprite.Sprite.__init__(self)
        self.type = random.choice(['lifeUp','powerUp'])
        self.image = powerup_images[self.type]
        self.image.set_colorkey(BLACK)
        self.rect = self.image.get_rect()
        self.rect.center = center
        self.speedy = 3
        
    def update(self):
        self.rect.y += self.speedy
        #si pasa el tope de la pantalla, el objeto debe morir , que sad :c
        if self.rect.top > HEIGHT:
            self.kill()
            
class Explosion(pygame.sprite.Sprite):
    def __init__(self, center, size):
        pygame.sprite.Sprite.__init__(self)
        self.size = size
        self.image = explosion_anim[self.size][0]
        self.rect = self.image.get_rect()
        self.rect.center = center
        self.frame = 0
        self.last_update = pygame.time.get_ticks()
        self.frame_rate = 50
        
    def update(self):
        now = pygame.time.get_ticks()
        if now - self.last_update > self.frame_rate:
            self.last_update = now
            self.frame += 1
            if self.frame == len(explosion_anim[self.size]):
                self.kill()
            else:
                center = self.rect.center
                self.image = explosion_anim[self.size][self.frame]
                self.rect = self.image.get_rect()
                self.rect.center = center
        
def show_go_screen():
    pantalla.blit(background, background_rect)
    draw_text(pantalla, "¡EyeFender!", 64, WIDTH/2, HEIGHT/4)
    draw_text (pantalla, "Arrow keys to move, SPACE to fire",22,WIDTH/2,HEIGHT/2)
    draw_text(pantalla, "Press any key to begin", 18, WIDTH/2, HEIGHT * 3/4)
    pygame.display.flip()
    waiting = True
    while waiting:
        reloj.tick(FPS)
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
            if event.type == pygame.KEYUP:
                waiting = False
              
#Aqui se cargan los graficos
background = pygame.image.load(path.join(img_dir, "fondo.jpg")).convert()
background_rect = background.get_rect()
jugador_img = pygame.image.load(path.join(img_dir, "EyeFender.png")).convert()
jugador_mini_img = pygame.transform.scale(jugador_img, (25,19))
jugador_mini_img.set_colorkey(BLACK)
jugadorHurt_img = pygame.image.load(path.join(img_dir, "EyeFenderHurt.png")).convert()

enemigo_images = []
enemigo_img = ['pestaña1.png','pestaña2.png']
for img in enemigo_img:
    enemigo_images.append(pygame.image.load(path.join(img_dir,img)).convert())

enemigo2_images = []
enemigo2_img = ['enemigos21.png','enemigos22.png']
for img in enemigo2_img:
    enemigo2_images.append(pygame.image.load(path.join(img_dir,img)).convert())
    
powerup_images = {}
powerup_images['lifeUp'] = pygame.image.load(path.join(img_dir, 'LifeUp.png')).convert()
powerup_images['powerUp'] = pygame.image.load(path.join(img_dir, 'powerUp.png')).convert()           
    
disparo_img = pygame.image.load(path.join(img_dir, "disparo.png")).convert()

explosion_anim = {}
explosion_anim['lg'] = [] 
explosion_anim['sm'] = []
explosion_anim['player'] = []
for i in range(9):
    filename = 'regularExplosion0{}.png'.format(i)
    img = pygame.image.load(path.join(img_dir, filename)).convert()
    img.set_colorkey(BLACK)
    img_lg = pygame.transform.scale(img,(75,75))
    explosion_anim['lg'].append(img_lg)
    img_sm = pygame.transform.scale(img,(32,32))
    explosion_anim['sm'].append(img_sm)
    filename = 'sonicExplosion0{}.png'.format(i)
    img = pygame.image.load(path.join(img_dir, filename)).convert()
    img.set_colorkey(BLACK)
    explosion_anim['player'].append(img)
    
#Aqui se cargan los sonidos
laser_sound = pygame.mixer.Sound(path.join(snd_dir, 'Disparo.wav'))
laser_sound.set_volume(0.2)
muerte_sound = pygame.mixer.Sound(path.join(snd_dir, 'Muerte.wav'))
muerte_sound.set_volume(0.2)
muerte2_sound = pygame.mixer.Sound(path.join(snd_dir, 'Muerte2.wav'))
muerte2_sound.set_volume(0.2)
muerteJugador_sound = pygame.mixer.Sound(path.join(snd_dir, 'MuerteJugador.wav'))
muerteJugador_sound.set_volume(1)
pygame.mixer.music.load(path.join(snd_dir,'Musica.wav'))
pygame.mixer.music.set_volume(1)
lifeUp_sound = pygame.mixer.Sound(path.join(snd_dir, 'lifeUp.wav'))
lifeUp_sound.set_volume(0.5)
powerUp_sound = pygame.mixer.Sound(path.join(snd_dir, 'powerUp.wav'))
powerUp_sound.set_volume(0.9)
           
#Aqui se cargan los tipos de sprites (Sprites es todos los sprites)



pygame.mixer.music.play(-1)#hace que la musica sea infinita
#Game loop
game_over = True
correr = True
while correr:
    if game_over:
        show_go_screen()
        game_over = False
        Sprites = pygame.sprite.Group()
        enemigos = pygame.sprite.Group()
        enemigos2 = pygame.sprite.Group()
        powerups = pygame.sprite.Group()
        disparos = pygame.sprite.Group()
        cons = ConstructorJugador()
        dire = Director(cons)
        dire.construirPersonaje()
        jugador = Jugador()
        Sprites.add(jugador)
        for i in range(7): #Aqui se crean los objetos de tipo Enemigo y se añaden como enemigos al conjunto de todos los Sprites
            nuevoEmgo()
            nuevoEmgo2()
        score = 0 
    #Mantener este loop con la velocidad indicada (fps)
    reloj.tick(FPS)    
    
    #Entradas (input)(eventos)
    for event in pygame.event.get():
        #evento para cerrar la ventana
        if event.type == pygame.QUIT:
             correr = False
        
             
    #Actualizacion(Update) aqui se dice qué hacer con los sprites  
      
    Sprites.update()
    
    #chequear colisiones de los disparos con los enmigos, es group collide por que los enemigos y los disparos son grupos
    #entonces la colision puede ser con cualquiera de las balas a cualquier enemigo
    
    hits = pygame.sprite.groupcollide(enemigos, disparos, True, True)
    for hit in hits:#este for crea un mob nuevo por cada mob muerto
        score = score+1
        muerte_sound.play()
        expl = Explosion(hit.rect.center, 'lg')
        Sprites.add(expl)
        if random.random() > 0.95: #5% de probabilidad de que salga un powerup
            power = powerUp(hit.rect.center)
            Sprites.add(power)
            powerups.add(power)               
        nuevoEmgo()
        
    #controla los hitbox (disparos,enemigos) con los enemigos de tipo 2
    hits = pygame.sprite.groupcollide(enemigos2, disparos, True, True)
    for hit in hits:#este for crea un mob nuevo por cada mob muerto
        score = score+5
        muerte2_sound.play()
        expl = Explosion(hit.rect.center, 'lg')
        Sprites.add(expl)
        if random.random() > 0.95: #5% de probabilidad de que salga un powerup
            power = powerUp(hit.rect.center)
            Sprites.add(power)
            powerups.add(power)        
        nuevoEmgo2()    
        
    #Chequear colisiones de los powerup con el jugador
    hits = pygame.sprite.spritecollide(jugador,powerups,True)
    for hit in hits:
        if hit.type == 'lifeUp':
            jugador.lifepoints += 10
            lifeUp_sound.play()
            evaluarLifepoints(jugador.lifepoints)
            if jugador.lifepoints >= 100:
                jugador.lifepoints = 100
        if hit.type == 'powerUp':
            jugador.powerup()
            powerUp_sound.play()
            
    
    #chequear colisiones de enmigos con el jugador
    #este es de los enemigos de tipo 1
    hits = pygame.sprite.spritecollide(jugador, enemigos, True, pygame.sprite.collide_circle)
    for hit in hits:       
        jugador.lifepoints = jugador.lifepoints-10
        expl = Explosion(hit.rect.center, 'sm')
        Sprites.add(expl)  
        nuevoEmgo()
        evaluarLifepoints(jugador.lifepoints)         
        if jugador.lifepoints<=0:
            death_explosion = Explosion(jugador.rect.center,'player')
            Sprites.add(death_explosion)
            muerteJugador_sound.play()
            jugador.hide()
            jugador.lives -= 1
            jugador.lifepoints = 100
            
    if jugador.lives==0 and not death_explosion.alive():
        game_over = True
        
        
    #este es de los enemigos de tipo 2
    hits = pygame.sprite.spritecollide(jugador, enemigos2, True, pygame.sprite.collide_circle)
    for hit in hits:       
        jugador.lifepoints = jugador.lifepoints-40
        expl = Explosion(hit.rect.center, 'sm')
        Sprites.add(expl)  
        nuevoEmgo2()    
        evaluarLifepoints(jugador.lifepoints)
        if jugador.lifepoints<=0:
            death_explosion = Explosion(jugador.rect.center,'player')
            Sprites.add(death_explosion)
            muerteJugador_sound.play()
            jugador.hide()
            jugador.lives -= 1
            jugador.lifepoints = 100            
    if jugador.lives==0 and not death_explosion.alive():#si el jugador muere y la animacion de muerte ya acabó  
        game_over = True             
    
        
    
    #Dibujo en pantalla(Draw,render)
    pantalla.fill(BLACK)
    pantalla.blit(background, background_rect) #Esto es una funcion especial que acomoda la imagen al juego
    Sprites.draw(pantalla) #pone el lugar donde dibujar los sprites
    draw_text(pantalla, str(score), 18, WIDTH/2, 10)
    draw_lifepoints(pantalla, 5, 5, jugador.lifepoints)
    draw_lives(pantalla, WIDTH-100,5,jugador.lives,jugador_mini_img )
    
    #Despues de dibujar todo (esto es doble buffer)
    pygame.display.flip()
    
pygame.quit()    