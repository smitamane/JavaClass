package excelsample;

public class Student implements Comparable{

    private final String name;
    private final int mark1;
    private final int mark2;
    private final int mark3;

      public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String getName() {
        return name;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    @Override
    public int compareTo(Object o) {
        Student cstudent=(Student) o;
       Integer thismarks = this.mark1+this.mark2+this.mark3;

        Integer totalmark=cstudent.getMark1()+cstudent.getMark2()+cstudent.getMark3();
        if(thismarks.compareTo(totalmark)==0)
        {
            return this.name.compareTo(cstudent.getName());
        }
        return thismarks.compareTo(totalmark);
    }
}
