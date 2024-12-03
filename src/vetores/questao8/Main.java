package vetores.questao8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int soma = 0;
        int pares = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0) {
                soma += numeros[i];
                pares++;
            }
        }

        if(soma != 0){
            double media = (double) soma / pares;
            System.out.printf("MEDIA DOS PARES: %.1f",media);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
