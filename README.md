# Modelos-de-programacion

Integrantes:- Javier Andres Aponte (20172020036)
            - Luis Daniel Hormiga (20172020026)
            - Luis Alejandro Ocampo Gamboa 20172020050

La siguiente es la implementecion de varios patrones de diseño en un solo programa. Para poder ver dicha implementacion se debe:

# · Catalogo de personajes (Abstract factory):
En el codigo para poder ver la forma en la que abstract factory fue implementado debemos ir al paquete Logica.Fabricas aqui podremos
encontrar las distintas fabricas que se usaron, en la ejecucion de la aplicacion abstract factory es usado por el patron Builder para armar
el personaje cuando este se selecciona en el menu.

# · Construir el personaje (Builder):
Para poder observar la implementacion de Builder nos tenemos que dirigir al paquete Logica.Constructores aqui podemos encontrar los distintos
constructores de cada tipo de personaje asi como la abstraccion general de personaje , el director y la implementacion de personajenativo (personaje
"original" del proyecto) en tiempo de ejecucion podemos ver este patron en accion cuando selecionamos un tipo de personaje en el menu.

# · Adaptar un personaje (Adapter):
En el paquete Logica.Adaptadores esta la implementacion del patron Adapter , la implementacion de este patron de diseño la podemos ver si seleccionamos
la raza "Enano" en el menu de inicio, la mayor peculiaridad de este personaje es que su metodo "Atacar" es muy diferente a el de los
personajes nativos.

# · Decorador (Decorated):
En el paquete Logica.Decorador encontrara las clases pertenencientes a la implementacion del patron Decorated ya en funcionanmiento para poder ver el funcionamiento del patron debera seleccionar una clase y funalmente precionar el boton añadir decorador (vera un cambio en las estadisticas en la parte inferior derecha de la pantalla ademas de un efecto grafico en la imagen)
