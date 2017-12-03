package less13InputOutputStreamsSerilization;

//6 Прочитать строки из файла и поменять местами первое и последнее слово в каждой строке

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        File inputFile = new File("less13task5.txt");
        File oututFile = new File("less13task6Result.txt");
        StringBuilder stringBuilder = new StringBuilder();


        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter printWriter = new PrintWriter(oututFile)) {

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                s.trim();
                String[] arrayStr = s.split(" ");
                String tmp = arrayStr[0];
                arrayStr[0] = arrayStr[arrayStr.length - 1];
                arrayStr[arrayStr.length - 1] = tmp;
                for (int i = 0; i < arrayStr.length; i++) {
                    stringBuilder.append(arrayStr[i] + " ");
                }
                printWriter.println(stringBuilder);
                stringBuilder.setLength(0);
                System.out.println(stringBuilder);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
