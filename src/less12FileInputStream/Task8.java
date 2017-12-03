package less12FileInputStream;

import java.io.*;
import java.util.*;

//задать програмно и заполнить файл случайными целыми числами.
// Отсортировать содержимое файла по возрастанию.
public class Task8 {
    public static void main(String[] args) {
        File outputFile = new File("less12task8.txt");
        final int MAX = 20;
        final int MIN = 10;
        List<Integer> list = new ArrayList<>();
        try {
            try (PrintWriter printWritter = new PrintWriter(outputFile)) {
                for (int i = 0; i < 50; i++) {
                    Integer ints = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
                    list.add(ints);
                }
                Collections.sort(list);
                for (Integer x : list) {
                    printWritter.println(x);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}