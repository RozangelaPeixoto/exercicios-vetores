package vetores.questao13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> funcionarios = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Emplyoee #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            Employee funcionario = new Employee(id, nome, salario);
            funcionarios.add(funcionario);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee result = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(result != null){
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            result.increaseSalary(porcentagem);
        }else{
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");
        for (Employee func : funcionarios) {
            System.out.println(func);
        }

        sc.close();

    }
}
