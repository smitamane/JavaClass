package excelsample;

public class Boy implements Comparable {
    private final String name;
    private final int age;

    public Boy(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }


    @Override
    public int compareTo(Object o)  {
        Boy cBoy=(Boy)o;
        Integer thisAge = this.age;
        Integer cBoyAge=cBoy.getAge();
        if(thisAge.compareTo(cBoyAge)==0)
        {
            return this.name.compareTo(cBoy.getName());
        }
        return thisAge.compareTo(cBoyAge);
    }
}
