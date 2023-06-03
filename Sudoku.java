package ex;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {

        int[][] matriz = new int[9][9];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Preenchendo algumas posições aleatoriamente
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (random.nextInt(10) < 3) { // Probabilidade de 30% de preencher a posição
                    matriz[i][j] = random.nextInt(9) + 1; // Número aleatório de 1 a 9
                } else {
                    matriz[i][j] = 0; // Posição vazia
                }
            }
        }

        // Imprimindo a matriz inicial
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        // Solicitando as posições e números ao usuário
        for (int k = 0; k < 10; k++) {
            System.out.println("Informe a linha (0-8) para inserir o número:");
            int linha = sc.nextInt();
            System.out.println("Informe a coluna (0-8) para inserir o número:");
            int coluna = sc.nextInt();
            System.out.println("Informe o número (1-9) a ser inserido:");
            int numero = sc.nextInt();

            // Verificando se a posição informada é válida e vazia
            if (linha >= 0 && linha < 9 && coluna >= 0 && coluna < 9 && matriz[linha][coluna] == 0 && numero >= 1 && numero <= 9) {
                matriz[linha][coluna] = numero;
            } else {
                System.out.println("Posição inválida ou ocupada! Tente novamente.");
                k--;
            }
        }

        // Imprimindo a matriz atualizada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
