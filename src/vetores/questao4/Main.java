package vetores.questao4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        int quantidadePares = 0;

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for(int numero : numeros){
            if(numero % 2 == 0) {
                System.out.print(numero + "   ");
                quantidadePares += 1;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadePares);
    }
}
