package less13InputOutputStreamsSerilization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

//5 В файле содержащим фамилии студентов и их оценки записать прописными буквами фамилии
// тех студентов которые имеют средний балл более 7.
public class task5 {
    public static void main(String[] args) {
//        Map<String, List<Integer>> map = new HashMap();
//        map.put("Петров", Arrays.<Integer>asList(2, 5));
//        map.put("Иванов", Arrays.<Integer>asList(8, 10));
//        map.put("Сидоров", Arrays.<Integer>asList(10, 7));

        File inputFile = new File("less13task5.txt");
        File outputFile = new File("less13task5Result.txt");
        List<String> marks = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10"));
        List<Integer> list = new ArrayList<>();
        int summ = 0;
        double avr = 0;

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter printWritter = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()) {
                String ss = scanner.nextLine();
                String s = ss;
                for (String mark : marks) {
                    if (s.contains(mark)) {
                        String x = mark;
                        list.add(Integer.valueOf(x));
                        s = s.replace(mark, "");
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    int x = list.get(i);
                    summ += x;
                    avr = summ / list.size();
                }
                if (avr >= 7) {
                    printWritter.println(ss.toUpperCase());
                } else printWritter.println(ss);
                avr = 0;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}


