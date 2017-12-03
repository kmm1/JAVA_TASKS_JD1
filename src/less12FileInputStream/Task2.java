package less12FileInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задан файл с текстом. Найти и вывести в консоль все слова для которых последняя буква
// одного слова совпадает с первой буквой следующего слова
public class Task2 {
    public static void main(String[] args) {
        String path = "less12task1.txt";
        File file = new File(path);
        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.next().toUpperCase().replaceAll("[!?,.)(]", "");
                if (!s.equals("")) {
                    list.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
        for (int i = 0; i < list.size() - 1; i++) {
            String a = list.get(i);
            for (int j = i + 1; j < i + 1 + 1; j++) {
                String b = list.get(j);
                if (a.charAt(a.length() - 1) == b.charAt(0)) {
                    System.out.println(a + " " + b);
                }
            }
        }
    }
}
