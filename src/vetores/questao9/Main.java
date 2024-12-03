package vetores.questao9;

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
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa(nome, idade);
        }

        int idadeMaisVelho = pessoas[0].idade;
        String nomeMaisVelho = pessoas[0].nome;

        for (Pessoa pessoa : pessoas) {
            if(pessoa.idade > idadeMaisVelho){
                idadeMaisVelho = pessoa.idade;
                nomeMaisVelho = pessoa.nome;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
    }
}
