package less12FileInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задан файл с текстом. Найти и вывести в консоль все слова начинающиеся с гласной буквы.
public class Task3 {
    public static void main(String[] args) {
        String path = "less12task1.txt";
        File file = new File(path);
        Set<String> vovels = new HashSet<>(Arrays.asList("а", "о", "у", "ы", "э", "е", "я"));

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.next();
                for (String vovel : vovels) {
                    if (s.startsWith(vovel)) {
                        System.out.println(s);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}