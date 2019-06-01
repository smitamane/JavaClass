public class Coumpoundinterest {

    public static void main(String[] args)
    {
        int principal=10000;
        int amount=2*principal;
        double r=7.5;
        double t;
        System.out.println("Entered Principal amount");
        t=(1/r)*((amount/principal)-1);
        System.out.println("Total time required to double the principal amount:-"+t);

    }
}

