package less12FileInputStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// задан файл со стихотворением пушкина.
// определить частоту повторяемости всех букв в стихотворении игнорируя регистор
//вывести результат в файл в виде а-15 б-7 и тд.
public class Task7 {
    public static void main(String[] args) {
        File inputFile = new File("less13task5.txt");
        File outputFile = new File("less13task7Result.txt");
        Map<Character, Integer> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter printWritter = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()) {
                char[] chars = scanner.nextLine().toUpperCase().toCharArray();
                for (Character s : chars) {
                    if (Character.isLetter(s)) {
                        map.put(s, map.get(s) == null ? 1 : map.get(s) + 1);
                    }
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                printWritter.print(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}