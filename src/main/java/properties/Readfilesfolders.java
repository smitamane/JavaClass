package properties;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Readfilesfolders {
    public static void main(String[]args) throws IOException {
        File myfile=new File("C:\\Users\\SangRam\\Desktop\\myfile.txt");
        if(!myfile.exists())
        {
            myfile.createNewFile();
        }
        String[]arrline={"one=1","two=2","three=3","neThree=3","four=4"};
        Files.write(Paths.get(myfile.getAbsolutePath()), Arrays.asList(arrline));

        List<String> string =  Files.readAllLines(Paths.get(myfile.getAbsolutePath()));
        for (String s : string) {
            System.out.println(s);
        }

    }
}
