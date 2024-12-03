package vetores.questao2;

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
        double soma = 0.0;

        System.out.println();
        System.out.print("VALORES = ");
        for(double numero : numeros){
            System.out.printf("%.1f  ", numero);
            soma += numero;
        }
        double media = soma / numeros.length;
        System.out.printf("%nSOMA = %.2f", soma);
        System.out.printf("%nMEDIA = %.2f", media);
        sc.close();
    }
}
