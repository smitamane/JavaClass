public class Highestandlowest {
    public static void main(String [] args)
    {
        int []numbers=new int [] {123,23,45,56,76,77,56};
        int max=numbers[0];
        int min = numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i]>max)
                {
                    max=numbers[i];
                }
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        System.out.println("Highest number is :"+ max);
        System.out.println("Smallest number is :"+ min);
    }
}
