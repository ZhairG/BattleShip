# BattleShip
**Juego hecho en Java**

## Tematica
**Batalla Naval**

## Descomposicion del codigo
### 1) Definir la estructura del juego: Clase JuegoBatallaNaval
### Clase JuegoBatallaNaval:
#### Atributos: 
- Tableros para dos jugadores. 
- Matrices para representar los barcos en cada tablero. 
- Tamañodel tablero (por defecto 10x10). 
#### Métodos: 
- inicializarTableros(): Configurar los tableros vacíos. 
- colocarBarco(jugador, fila, columna, longitud, orientacion): Disponer un barco en el tablero del jugador. 
- realizarDisparo(jugador, fila, columna): Realizar un disparo en el tablero del oponente. 
- verificarVictoria(jugador): Verificar si el jugador ha ganado.
### 2) Crear la clase **Jugador**: 
#### Atributos: 
- Nombredel jugador. 
- Tablero para barcos. 
- Tablero para disparos. 
#### Métodos: 
- colocarBarco(fila, columna, longitud, orientacion): Disponer un barco en el tablero del jugador.
- disparar(oponente, fila, columna): Realizar un disparo en el tablero del oponente.
