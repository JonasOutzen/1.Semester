public class HourlyPaidEmployee extends Employee {
    private int hours;
    private int ratePrHour;

    public HourlyPaidEmployee(String name, int years, String title, int hours, int ratePrHour){
        super(name, years, title);
        this.hours = hours;
        this.ratePrHour = ratePrHour;
    }
    @Override
    public int getSalary(){
        return hours * ratePrHour;
    }
}