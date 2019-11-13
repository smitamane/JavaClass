package properties;

import java.io.*;
import java.util.Enumeration;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;

public class Filereader {
public static void main(String[] args) throws IOException {
    ResourceBundle pr = ResourceBundle.getBundle("package.myProperties");
    System.out.println(pr.getString("Pin"));
    File x= new File("C:\\Users\\SangRam\\Desktop\\myfile.txt");
    FileReader FX= new FileReader(x);
    BufferedReader br = new BufferedReader(FX);
    PropertyResourceBundle ps = new PropertyResourceBundle(br);
    Set<String> strings = ps.keySet();
    for (String string : strings) {
        System.out.println(string);
    }
}
}
