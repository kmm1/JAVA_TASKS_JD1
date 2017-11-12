package collections;

import java.util.*;

//   1 Написать метод CountUnique который принимает целочисленный список в качестве параметра
//    и возвращает количество уникальных целых чисел в этом списке.
//    При получении пустого списка метод должен возвращать 0.
//    Пример: [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернет 5.

//   2 Создайте контейнер Set со всеми гласными буквами. Подсчитать и вывести количество
//    гласных в каждом входном слове, а также вывидите количество гласных во входном слове.

//   3 Задан текст на английском языке. Выделить все различные слова.
//    Для каждого слова подсчитать часоту его встречаемости.Слова, отличающиеся регистром букв, считать разными.

//   4 Написать метод IsUnique,который принимает Map<String,String>и возвращает true
//    если два различных ключа не соответствуют двум одинаковым значениям.
//    Напимер,в данном случае вернется true:{Marty=Stepp, Stuart=Reges, Jessica=Miller}
//    А в данном false:{Marty=Stepp, Stuart=Reges, Jessica=Stepp}.

// 5
// заполнить список случайными числами и посчитать частоту их встречаемости


public class CountUnique {
    //1
//    private static String countUnique() {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> myArrayList = new ArrayList<>();
//        String myAnswer;
//
//        do {
//            System.out.println("Введите любое целое число: ...");
//            int myNextNumber = scanner.nextInt();
//            myArrayList.add(myNextNumber);
//            System.out.println("Желаете ввести еще число? да/нет ...");
//            myAnswer = scanner.next();
//        } while (myAnswer.equals("да"));
//
//        System.out.println("Вы ввели следующий ряд чисел: " + myArrayList.toString());
//        Set<Integer> myHashSet = new HashSet(myArrayList);
//        System.out.println("Количество уникальных целых чисел в списке: " + myHashSet.size());
//        return null;
//    }
//
//    public static void main(String[] args) {
//        String result = countUnique();
//    }
//}


    //2
//    private static Map<String, Integer> CountVowel() {
//        Scanner scanner = new Scanner(System.in);
//        Map<String, Integer> map = new HashMap<>();
//        Set<String> vowelsSet = new HashSet<>(Arrays.asList("а", "о", "у", "и", "ы", "е", "я", "э"));
//        System.out.println("Введите слово:");
//        String myWord = scanner.nextLine();
//        List<String> wordList = new ArrayList<>(Arrays.asList(myWord.split("")));
//
//        for (int i = 0; i < wordList.size(); i++) {
//            String nextWord = wordList.get(i);
//            if (vowelsSet.contains(nextWord)) {
//                Integer fraquancy = map.get(nextWord);
//                map.put(nextWord, fraquancy == null ? 1 : fraquancy + 1);
//            }
//        }
//        return map;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(CountVowel());
//    }


    //3
//    private static Map<String, Integer> CountWords(String anyText) {
//        anyText = anyText.replaceAll("[-.?!)(,:]", "");
//        List<String> list = new ArrayList<>(Arrays.asList(anyText.split(" ")));
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            String word = list.get(i);
//            if (map.containsKey(word)) {
//                map.replace(word, map.get(word) + 1);
//            } else map.put(word, 1);
//        }
//        return map;
//    }
//    public static void main(String[] args) {
//        System.out.println(CountWords("Entry is the sub interface of Map. So we will be accessed it by Map. Entry name. " +
//                "It provides methods to get key and value."));
//    }


    //4
//    private static boolean isUnique() {
//        Scanner scanner = new Scanner(System.in);
//        Map<String, String> myMap = new HashMap<>();
//        String myNextName;
//        String myNextSurname;
//        String myAnswer;
//        do {
//            System.out.println("Введите имя ученика...");
//            myNextName = scanner.next();
//            System.out.println("Введите фамилию ученика...");
//            myNextSurname = scanner.next();
//            myMap.put(myNextName, myNextSurname);
//            System.out.println("Желаете ввести данные следующих учеников?  да/нет");
//            myAnswer = scanner.next();
//        } while (myAnswer.equals("да"));
//
//        System.out.println("Вы ввели следующие значения: " + myMap.size() + myMap.entrySet());
//        Set<String> myKeys = new HashSet<>(myMap.keySet());
//        Set<String> myValues = new HashSet<>(myMap.values());
//        if (myKeys.size() == myValues.size()) {
//            return true;
//        } else return false;
//    }
//    public static void main(String[] args) {
//        System.out.println(isUnique());
//    }


    //5
//    public static void main(String[] args) {
//        System.out.println(countUniqueNumbers());
//    }
//
//    private static Map<Integer, Integer> countUniqueNumbers() {
//        Map<Integer, Integer> map = new HashMap<>();
//        Random random = new Random();
//        for (int i = 0; i < 500; i++) {
//            Integer nextNumber = random.nextInt(10);
//            Integer fraquancy = map.get(nextNumber);
//            map.put(nextNumber, fraquancy == null ? 1 : fraquancy + 1);
//        }
//        return map;
//    }
//}



}