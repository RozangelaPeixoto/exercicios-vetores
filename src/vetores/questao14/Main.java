package vetores.questao14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][];

        for(int i = 0; i < n; i++){
            matriz[i] = new int[m];
            for (int j = 0; j < m; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        int numero = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(numero == matriz[i][j]) {
                    System.out.println("Position " + i + "," + j);
                    if (j != 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i != 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if(j != m-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i != n-1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
