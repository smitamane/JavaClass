public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int number, reminder;
        number = 3456;
        int reverse;
        reverse = 0;
        System.out.println("Entered number:"+ number);
        while(number!=0)
        {
            reverse=reverse*10;
            reverse=reverse+number%10;
            number=number/10;
        }
        System.out.println("reverse number:"+reverse);

    }
}
