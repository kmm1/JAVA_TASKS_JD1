package less18RegEx;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tom on 06.12.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        String s = "This is a <EM>first</EM> test";
        Pattern pattern = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            s = s.replace(matcher.group(1), "@@@");
        }
        System.out.println(s);

        System.out.println("This is a <EM>first</EM> test".replaceAll("<([A-Z][A-Z0-9]*)", "$1 @@@"));


    }
}
