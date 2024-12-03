package vetores.questao1;

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
        boolean titulo = false;
        for (int numero : numeros) {
            if (numero < 0) {
                if(!titulo){
                    System.out.println("NUMEROS NEGATIVOS:");
                    titulo = true;
                }
                System.out.println(numero);
            }
        }
        if(!titulo) System.out.println("NAO HA NUMEROS NEGATIVOS");


        sc.close();
    }
}
