import com.sun.deploy.util.StringUtils;


public class Extraspace {
    public static void main(String args[])
    {
        String sentence="Hellow     welcome to In        dia ";
        System.out.println(sentence);
        String[]normalstring=sentence.split(" ");
        String normalizedstring;
        String space = " ";

       for(int i = 0;i<normalstring.length;i++)
       {
           for(int j=0;j<=space.length();j++)
           {
               normalizedstring=normalstring[i].replace(normalstring[j]," ");
               normalizedstring=normalstring[i];
           }
       }

    }
}
