package inheritance;

public class CustomEmployee extends Employee {


    public CustomEmployee(String name, String dept, String surname, int salary)
    {
        super(name, dept, surname, salary);
    }
 public void appraisal(int perhike)
    {
        salary += salary*perhike/100;

    }

    public int getSalary()
    {
        return salary;

    }

}
