public class Combinationstring {

    //To display permutations and combinations of given string
    public static void main(String[] args) {
        {
            String name = "smita";
            System.out.println(name);
            for (int i = 0; i < name.length(); i++)
            {
                String lastchar;

                System.out.println(name.substring(i+1)+name.substring(0,i+1));
               // name= name.substring(1)+name.charAt(0);
            }
        }
    }
}
