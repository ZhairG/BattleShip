# BattleShip
**Juego hecho en Java**

## Tematica
**Batalla Naval**

## Desarrollo del codigo
### 1) Definir la estructura del juego:
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
### 3) Crear el tablero del juego: Inicializar el tablero: 
- Crear una matriz para representar el tablero, donde se colocarán los barcos y se registrarán los disparos.
- Lostableros deben ser inicializados con un símbolo para agua (por ejemplo, '~').
### 4) Implementar la lógica del juego: 
- Colocar barcos: ○ Definir métodos para colocar barcos en el tablero, asegurando que no se superpongan y que estén dentro de los límites.
- Realizar disparos: ○ Implementar la lógica para manejar los disparos, marcando los resultados en el tablero del oponente (agua, impacto, hundimiento).
- Verificar victoria: ○ Comprobar si todos los barcos del oponente han sido hundidos para determinar si un jugador ha ganado.
