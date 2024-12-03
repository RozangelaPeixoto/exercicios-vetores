package vetores.questao11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Genero: ");
            char genero = sc.next().toUpperCase().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);
        }

        double menorAltura = pessoas[0].altura;
        double maiorAltura = pessoas[0].altura;
        double somaAlturaMulheres = 0;
        double mediaAlturaMulheres = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;

        for(Pessoa pessoa : pessoas){
            if(pessoa.altura < menorAltura){
                menorAltura = pessoa.altura;
            }else if(pessoa.altura > maiorAltura){
                maiorAltura = pessoa.altura;
            }

            if(pessoa.genero == 'F'){
                numeroMulheres++;
                somaAlturaMulheres += pessoa.altura;
            }else if(pessoa.genero == 'M'){
                numeroHomens++;
            }
        }
        mediaAlturaMulheres = somaAlturaMulheres/ numeroMulheres;
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f", mediaAlturaMulheres);
        System.out.println("\nNumero de homens = " + numeroHomens);


    }
}
