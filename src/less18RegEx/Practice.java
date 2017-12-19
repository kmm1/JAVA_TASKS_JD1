package less18RegEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Мне нужно заменить все символы с - / на - \ между тегами <tagname> ... </tagname>.
public class Practice {

    public static void main(String[] args) throws FileNotFoundException {
        String startTag = "<tagname>";
        String endTag = "</tagname>";

        String s = "fir/st exa/mple li/ne " + startTag + "fir/st exa/mple li/ne" + endTag
                + "\nsec/ond exa/mple li/ne " + startTag + "sec/ond exa/mple li/ne" + endTag;

        System.out.println("До изменения: \n" + s);

        Pattern pattern = Pattern.compile(startTag + "(.*?)" + endTag);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
            s = s.replace(matcher.group(0), startTag + matcher.group(1).replace("/", "\\") + endTag);
        }

        System.out.println("\nПосле изменения: \n" + s);
    }


    //Стоит задача поиска всех не повторяющихся тегов без атрибутов (например, head, body)
// в HTML файле с помощью регулярных выражений.
//    public static void main(String[] args) {
//        String tmp = "<html><head></head><body><div></div><DIV><pre></pre></div></body></html>";
//        Pattern p = Pattern.compile("<([^> ]+)>(?=(?:.*<(\\1)>)?)", Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher(tmp);
//        List<String> exclude = new ArrayList<String>();
//        while (m.find()) {
//            if (m.group(2) != null) {
//                exclude.add(m.group(2).toLowerCase());
//            }
//            if (exclude.indexOf(m.group(1).toLowerCase()) == -1) {
//                System.out.println(m.group());
//            }
//        }
//    }

    //Есть строка #tag1#tag2#tag3. Какое регулярное выражение мне использовать в яве что бы получить каждый тег?
//    public static void main(String[] args) {
//
//        String testStr = "#tag1#tag2#tag3";
//
//        Pattern p = Pattern.compile("#(\\w)+");
//        Matcher m = p.matcher(testStr);
//
//        while (m.find()) {
//            System.out.println(testStr.substring(m.start() + 1, m.end()));
//        }//  }


    //как с помощью регулярного выражения удалить повторяющиеся слова в строке. К примеру есть строка:
    //String st = "hello world world world world"
    //Нужно с помощью регулярного выражения удалить повторения и получить
    //String st = "hello world"
//    public static void main(String[] args) {
//        String str = "hello   hello world world world world";
//        String pat = "\\b(\\w+)(?:\\s+\\1\\b)+";
//        String res = str.replaceAll(pat, "$1");
//        System.out.println(res); // => hello world
//        // Для регистронезависимого поиска добавьте(? i) в начале шаблона: String pat = "(?i)\\b(\\w+)(?:\\s+\\1\\b)+";


}
