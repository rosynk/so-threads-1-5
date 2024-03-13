package view;

import controller.Matriz2;

import java.util.Random;

public class MainMatriz2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];

        preencherNumerosAleatorios(matriz);

        for (int thread = 0; thread < 3; thread++) {
            
            Thread threadSoma = new Matriz2(matriz[thread], thread);
            threadSoma.start();
        }
    }

    public static void preencherNumerosAleatorios(int[][] matriz) {
        Random aleatorio = new Random();

        int tamanhoLinhas = matriz.length;
        int tamanhoColunas = matriz[0].length;

        for (int x = 0; x < tamanhoLinhas; x++) {
            for (int y = 0; y < tamanhoColunas; y++) {
                matriz[x][y] = aleatorio.nextInt(10); 
               
            }
         
        }
    }
}