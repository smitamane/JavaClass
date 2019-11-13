package inheritance;

public class Employee {

    private String name;
    private String dept;
    private String surname;
    protected int salary;

    public Employee(String name, String dept, String surname, int salary) {
        this.name = name;
        this.dept = dept;
        this.surname = surname;
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void appraisal()
    {
        salary += salary/10;
        //return salary;
    }

}
