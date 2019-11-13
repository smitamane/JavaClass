package inheritance;

public class Goodemployee extends Employee
{
    public Goodemployee(String name, String dept, String surname, int salary)
    {
        super(name, dept, surname, salary);
    }
    @Override
    public void appraisal()
    {
        salary += salary*20/100;

    }
}
