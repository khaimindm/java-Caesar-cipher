import service.Decoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String readLine = null;
        Decoder decoder = new Decoder();

        try {
            FileReader reader = new FileReader("src/main/resources/source_text.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            ArrayList<String> strings = new ArrayList<>();

            bufferedReader.lines().forEach(strings::add);

            for (int k = 1; k < 33; k++) {
                System.out.println("k = " + k);
                for (int i = 0; i < strings.size(); i++) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int j = 0; j < strings.get(i).length(); j++) {
                        char processedCharacter = strings.get(i).charAt(j);
                        if (Character.isLetter(processedCharacter)) {
                            stringBuffer.append(decoder.decode(processedCharacter, k));
                        } else {
                            stringBuffer.append(processedCharacter);
                        }
                    }
                    System.out.println(stringBuffer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
