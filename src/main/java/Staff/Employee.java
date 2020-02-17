package Staff;

public abstract class Employee {

    private String name;
    private String ni;
    private Double salary;

    public Employee(String name, String ni, Double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double amount){
        if(amount < 0){
            amount *= -1;
        }

        this.salary += amount;
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }
}
