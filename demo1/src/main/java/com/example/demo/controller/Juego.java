package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class Juego {
    private int filas = 10;
    private int columnas = 10;
    private boolean[][] lago = new boolean[filas][columnas];

    public void inicializar(String posicionesIniciales) {
        String[] posiciones = posicionesIniciales.split(" ");
        for (String posicion : posiciones) {
            String[] coordenadas = posicion.replace("(", "").replace(")", "").split(",");
            int x = Integer.parseInt(coordenadas[0]);
            int y = Integer.parseInt(coordenadas[1]);
            lago[x][y] = true;
        }
    }

    public boolean[][] getLago() {
        return this.lago;
    }

    public void ejecutar(int fotos) {
        for (int foto = 0; foto < fotos; foto++) {
            boolean[][] nuevoLago = new boolean[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas - 1; j++) {  
                    if (lago[i][j]) {
                        nuevoLago[i][j + 1] = true;
                    }
                }
            }
            lago = nuevoLago;
        }
    }


}