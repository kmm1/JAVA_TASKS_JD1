package less4StringStringBufferStringBuilder;

import java.util.*;

/**
 * Created by Tom on 24.11.2017.
 */
public class lessString {
    //Напишите метод проверки, является ли строка палиндромом.
    //Строка называется палиндромом, если она одинаково читается в обоих направлениях.
    // К примеру “аба” является строкой-палиндромом.

//    public static void main(String[] args) {
//        System.out.println(isPaliandrom("аба"));
//        System.out.println(isPaliandromSecondOption("аба"));
//    }
//
//    private static boolean isPaliandrom(String string) {
//        StringBuilder stringBuilder = new StringBuilder(string);
//        stringBuilder.reverse();
//        return stringBuilder.toString().equals(string);
//    }
//
//    private static boolean isPaliandromSecondOption(String string) {
//        for (int i = 0; i < string.length() / 2; i++) {
//            char firstChar = string.charAt(i);
//            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }

    //Напишите метод удаления данного символа из строки.

//    public static void main(String[] args) {
//        String string = "fffjjj";
//        System.out.println(string);
//        System.out.println(replaceChar(string, 'j'));
//    }
//    private static String replaceChar(String string, char ch) {
//        return string.replaceAll(Character.toString(ch), "");
//    }

    //Как мы можем перевести строку в верхний регистр или нижний регистр?
//    public static void main(String[] args) {
//        String string = "some String";
//        System.out.println(string.toLowerCase());
//        System.out.println(string.toUpperCase());
//    }

    //Как обрезать пробелы в конце строки?
//    public static void main(String[] args) {
//        String s = "a    ";
//        System.out.println(s.trim() + "b");//ab
//        System.out.println(s + "b");//a    b
//    }

    //Ввести строку и подсчитать кол-во запятых в ней. Найти в строке не только запятые,
    // но и другие знаки препинания. Подсчитать общее их кол-во
    //перебор всех элементов строки
//    public static void main(String[] args) {
//        String string = "He, she, I, it";
//        String string2 = "He, she, I, it";
//        int count = 0;
//        int count2 = 0;
//        char sumbal;
//        for (int i = 0; i < string.length(); i++) {
//            sumbal = string.charAt(i);
//            if (sumbal == ',') {
//                count++;
//            }
//        }
//        System.out.println(count);
////использование функции поиска
//        int p = 0;
//        while (p != -1) {
//            p = string2.indexOf(',', p);
//            if (p != -1) {
//                p++;
//                count2++;
//            }
//        }
//        System.out.println(count2);
//    }

    //Имеется строка с текстом. Подсчитать кол-во слов в тексте.
    // Желательно учесть что слова могут разделяться несколькими пробелами.
    // В начале и в конце текста также могут быть пробелы.
//    public static void main(String[] args) {
//        String someText = "This is my strange text. This is cool  ";
//        someText.replaceAll("[-.?!)(,:]", "").toUpperCase();
//        someText.intern();
//        List<String> list = new ArrayList<>(Arrays.asList(someText.split(" ")));
//        System.out.println(list);
//        Map<String, Integer> countUniqueWordsMap = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            String word = list.get(i);
//            countUniqueWordsMap.put(word, countUniqueWordsMap.get(word) == null ? 1 : countUniqueWordsMap.get(word) + 1);
//        }
//        System.out.println(countUniqueWordsMap.toString());
//
//    }


//    final String twoSpaces="  ";
//    final String oneSpace=" ";
//    String myText; //наша строка
//while(myText.indexOf(twoSpaces) >= 0) {
//        myText.replace(twoSpaces, oneSpace);
//    }

    //Имеется строка с текстом. Вывести текст составленный из последних букв всех слов.
//    public static void main(String[] args) {
//        String string = "This is my text";
//        StringBuilder stringBuilder = new StringBuilder();
//        string = string.toUpperCase().replaceAll("[-.!?)(:]", " ").trim();
//        List<String> list = new ArrayList<>(Arrays.asList(string.split(" ")));
//        for (int i = 0; i < list.size(); i++) {
//            char ch = list.get(i).charAt(0);
//            stringBuilder.append(ch);
//        }
//        System.out.println(stringBuilder);
//    }

    //Напишите два цикла выполняющих многократное сложение строк.
    // Один при помощи оператора сложения и String а другой при помощи StringBuilder
    // и метода append. Сравните скорость их выполнения


}
