import java.util.Arrays;

public class Reverseeachwordinstring {

    public static void main(String[] args)
    {
        String sentence = "Hellow h Friends welcome to India";

        String [] splitedstring = sentence.split(" ");
        String reversestring = "";
        for(int i=0;i<splitedstring.length;i++)
        {
            String word=splitedstring[i];
            String reverseword = "";
            for(int j=word.length()-1;j>=0;j--)
            {
                reverseword= reverseword+word.charAt(j);

            }

            reversestring=reversestring+reverseword+" ";
        }
        System.out.println(sentence);
        System.out.println(reversestring);

        }
}
