package less12FileInputStream;

import java.io.*;
import java.util.Scanner;

//Задан файл с Java кодом. Прочитать текст программы из файла и высе слова public в
// объявлении атрибутов и методов класса заменить на слово private.
// Результат сохранить в другой заранее созданный файл.
public class task5 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileInput = new File("less12task5.txt");
        File fileOutput = new File("less12task5result.txt");

//        PrintWriter printWriter = new PrintWriter(fileOutput);

        try (Scanner scanner = new Scanner(fileInput);
             PrintWriter writer = new PrintWriter(fileOutput)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                System.out.println(s);
                if (!s.contains("class")) {
                    s = s.replaceAll("public", "private");
                    writer.println(s);
                }else writer.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
