package less13InputOutputStreamsSerilization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// 7 Задан файл со стихотворением Есенина.
//  Подсчитать частоту повторяемости каждого слова в стихотворении и вывести эти слова
//  в порядке возрастания частоты повторяемости
public class Task7 {
    public static void main(String[] args) {

        File inputFile = new File("less13task5.txt");
        File outputFile = new File("less13task7Result.txt");
        Map<String, Integer> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter printWriter = new PrintWriter(outputFile)) {

            while (scanner.hasNextLine()) {
                String s = scanner.next();
                String[] strArray = s.replaceAll("[,!?:'\\\"\\\"//-/-/'.)(-*/]", "").toUpperCase().split(" ");
                for (String x : strArray) {
                    map.put(x, map.get(x) == null ? 1 : map.get(x) + 1);
                }
            }
            for (Map.Entry<String, Integer> x : map.entrySet()) {
                printWriter.println(x.getKey() + " " + x.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}