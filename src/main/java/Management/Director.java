package Management;

public class Director extends Manager {
    private Double budget;

    public Director(String name, String ni, Double salary, String deptName, Double budget){
        super(name, ni, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}
