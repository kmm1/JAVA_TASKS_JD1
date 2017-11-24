package less12FileInputStream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Задан файл с многострочным текстом. Прочитать и вывести этот файл в консоль построчно
public class task1 {
    public static void main(String[] args) {
        File file = new File("less12task1.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } ;



    }


}

