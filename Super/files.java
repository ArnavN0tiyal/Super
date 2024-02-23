package Super;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class files {
    static File file = new File("Super.txt");

    public void $fileWrite(String txt) throws IOException {
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(txt);
        filewriter.flush();
        filewriter.close();
    }

    public String $fileRead() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str1 = " ", str2 = " ";
        str2 = bufferedReader.readLine();
        while ((str1 = bufferedReader.readLine()) != null) {
            str2 = str2 + "\n" + str1;
        }
        bufferedReader.close();
        return str2;
    }
}
