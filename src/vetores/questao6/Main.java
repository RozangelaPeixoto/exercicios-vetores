package vetores.questao6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        String[] nomeVetores = new String[]{"vetor A", "vetor B"};
        int[] vetorC = new int[n];
        int[][] vetores = new int[2][];
        vetores[0] = new int[n];
        vetores[1] = new int[n];

        for(int i = 0; i < vetores.length; i++) {
            System.out.println("Digite os valores do " + nomeVetores[i]);
            for (int j = 0; j < vetores[i].length; j++) {
                vetores[i][j] = sc.nextInt();
                vetorC[j] += vetores[i][j];
            }
        }
        System.out.println("VETOR RESULTANTE:");
        for(int numero : vetorC){
            System.out.println(numero);
        }

        sc.close();
    }
}
