package less12FileInputStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Задан файл с Java-кодом. Прочитать текст программы из файла и записать в другой
// файл в обратном порядке символы каждой строки.
public class Task6 {
    public static void main(String[] args) {
        File inputFile = new File("less12task5.txt");
        File outputFile = new File("less12task5result.txt");
        StringBuffer stringBuffer = new StringBuffer();
        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter printWriter = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                stringBuffer.append(s).reverse();
                printWriter.println(stringBuffer);
                stringBuffer.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
