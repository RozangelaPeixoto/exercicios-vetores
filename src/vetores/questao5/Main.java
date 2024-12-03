package vetores.questao5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double maiorNumero = numeros[0];
        int posicao = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
                posicao = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n",maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
    }
}
