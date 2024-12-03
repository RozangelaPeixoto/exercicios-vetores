package vetores.questao7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        double soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f", media);
        boolean titulo = false;
        for(double numero: numeros){
            if(numero < media){
                if(!titulo){
                    titulo = true;
                    System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
                }
                System.out.println(numero);
            }
        }

    }
}
