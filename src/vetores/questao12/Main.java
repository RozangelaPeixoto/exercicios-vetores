package vetores.questao12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Aluguel[] rooms = new Aluguel[10];
        for(int i = 0; i < n; i++){
            System.out.println("Rent#" + (i+1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int m = sc.nextInt();
            rooms[m] = new Aluguel(nome, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i] .nome + ", " + rooms[i] .email);
            }
        }
    }
}
