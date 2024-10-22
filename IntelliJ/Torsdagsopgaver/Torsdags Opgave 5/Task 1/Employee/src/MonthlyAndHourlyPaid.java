public class MonthlyAndHourlyPaid extends Employee {
    private int baseSalary;
    private int ratePrHour;
    private int hours;

    public MonthlyAndHourlyPaid(String name, int yearsHired, String title, int hours, int ratePrHour, int baseSalary) {
        super(name, yearsHired, title);
        this.hours = hours;
        this.ratePrHour = ratePrHour;
        this.baseSalary = baseSalary;
    }

    @Override
    public int getSalary() {
        int hourlySalary = ratePrHour * hours;
        return baseSalary + hourlySalary;
    }
}