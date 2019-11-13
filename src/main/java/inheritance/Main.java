package inheritance;

public class Main {
    public static void main(String [] args)
    {
        Employee e1=new Employee("Smita","HR","Mane", 2000);
        e1.appraisal();
        System.out.println("First Salary:"+ e1.getSalary());
        Goodemployee g1=new Goodemployee("Smita","HR","Mane", 2000);
        g1.appraisal();
        System.out.println("Good Salary:"+ g1.getSalary());

        CustomEmployee c1= new CustomEmployee("Smita","HR","Mane", 2000);
        c1.appraisal(30);
        System.out.println("Custom Employee:"+ c1.getSalary());

    }
}
