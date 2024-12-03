package vetores.questao10;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Estudante[] alunos = new Estudante[n];
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Dados do " + (i+1) + "o aluno:");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            alunos[i] = new Estudante(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for(Estudante aluno : alunos){
            double media = (aluno.nota1 + aluno.nota2) / 2;
            if (media >= 6){
                System.out.println(aluno.nome);
            }
        }
    }
}
