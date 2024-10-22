public class SalesPerson extends Employee {

    private int baseSalary;
    private int provision;

    public SalesPerson(String name, String title, int years, int baseSalary, int provision) {
        super(name, years, title);
        this.baseSalary = baseSalary;
        this.provision = provision;
    }

    @Override
    public int getSalary() {
        return baseSalary + (baseSalary + provision);
    }

}