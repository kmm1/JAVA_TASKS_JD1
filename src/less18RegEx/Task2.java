package less18RegEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу выполняющую поиск в строке всех тегов обзацев в том числе тех у которых есть параметры например
// <p id="pl"> и заменить их на простые теги обзацев <p>
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
//        String string = "text text<p id=\"pl\"> text text <p> </p> <p id=\"pl\"> <a><a>";
//        Pattern pattern = Pattern.compile("<[A-Za-z]+([^>.]+?)>");
//        Matcher matcher = pattern.matcher(string);
//        System.out.println(string);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//            string = string.replace(matcher.group(1), "");
//        }
//        System.out.println(string);

        File inputFile = new File("less18task1RegEx.txt");
        File outFile = new File("less18task1RegExResult.txt");
        try (Scanner scanner = new Scanner(inputFile); PrintWriter printWriter = new PrintWriter(outFile)) {
            Pattern pattern = Pattern.compile("<[A-Za-z]+([^>]{5,})>");  //regexr.com
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                Matcher matcher = pattern.matcher(s);
                if ((matcher.find())) {
                    s = s.replace(matcher.group(1), "");
                    printWriter.println(s);
                } else if (!matcher.find()) {
                    printWriter.println(s);
                }
            }
        }
    }
}