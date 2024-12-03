package vetores.questao3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da "+ (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
        double soma = 0.0;
        int menores = 0;
        StringBuilder nomeMenores = new StringBuilder();
        for(Pessoa pessoa : pessoas){
            soma += pessoa.altura;
            if (pessoa.idade < 16) {
                menores += 1;
                nomeMenores.append("\n").append(pessoa.nome);
            }
        }
        System.out.println();
        double media = soma / pessoas.length;
        System.out.printf("Altura média: %.2f", media);
        double porcentagem = (double) menores*100 / pessoas.length;
        System.out.print("\nPessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
        System.out.println(nomeMenores);


        sc.close();
    }
}
