package vetores.questao13;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary += salary * (percentage/100);
    }

    public String toString(){
        return id + ", "
                + name + ", "
                + String.format("%.2f",salary);
    }

    public Integer getId() {
        return id;
    }
}
