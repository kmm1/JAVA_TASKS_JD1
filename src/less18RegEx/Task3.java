package less18RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//поиск в строке шестнадцетиричных чисел записанных по правилам JAVA и с помощью RegEx вывести их на страницу
//Шестнадцатеричное значение задается с помощью символов «0x» или «0X»,
// за которым значение числа (цифры 0-9 и буквы A-F или a-f), например: 0x7FFF.
public class Task3 {
    public static void main(String[] args) {
        String s = "0x7FFF=? 0x0 0x7FFF 255 233  7FFF";
        Pattern pattern = Pattern.compile("[0oOОо][ХхXx]\\d*[A-Fa-f]*");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
