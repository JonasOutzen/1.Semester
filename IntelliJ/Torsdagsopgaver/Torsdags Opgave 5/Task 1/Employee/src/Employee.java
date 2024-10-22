public abstract class Employee {
    private String name;
    private int yearsHired;

    private String title;

    public Employee(String name, int yearsHired, String title) {
        setName(name);
        setYearsHired(yearsHired);
        setTitle(title);
    }

    public abstract int getSalary();

    public String getName() {
        return name;
    }

    // Name must be more than one character
    public void setName(String name) {
        if(!name.equals("") && name != null && name.length() > 1 && name.length() < 30)
            this.name = name;
        else throw new IllegalArgumentException("Name is not long enough");
    }

    public int getYearsHired() {
        return yearsHired;
    }

    public void setYearsHired(int yearsHired) {
        this.yearsHired = yearsHired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}