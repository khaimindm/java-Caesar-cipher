package repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRepository {

    public String readFile() {
        String readLine = null;
        try {
            FileReader reader = new FileReader("src/main/resources/source_text.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            readLine = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readLine;
    }
}
