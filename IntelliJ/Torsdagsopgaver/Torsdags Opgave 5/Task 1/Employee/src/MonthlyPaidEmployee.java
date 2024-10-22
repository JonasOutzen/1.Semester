public class MonthlyPaidEmployee extends Employee {
    private int monthlySalary;

    public MonthlyPaidEmployee(String name, int yearsEmployed, String titel, int salary){
        super(name, yearsEmployed, titel);
        this.monthlySalary = salary;
    }
    @Override
    public int getSalary(){
        return monthlySalary;

    }


}