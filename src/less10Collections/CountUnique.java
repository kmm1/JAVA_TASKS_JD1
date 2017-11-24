package less10Collections;

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

//    5
// заполнить список случайными числами и посчитать частоту их встречаемости

//   6
//Дан список целых чисел. Найти средне всех нечетных чисел, делящихся на 5.

//   7
//Дан список строк. Найти кол-во уникальных строк длинной более 8 символов.

//  8
//  Дана Map <String, Integer>. Найти сумму всех значений, длинна ключей которых меньше 7 символов.

//


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


//2 Создайте контейнер Set со всеми гласными буквами. Подсчитать и вывести количество
//    гласных в каждом входном слове, а также вывидите количество гласных во входном слове.
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

//   3 Задан текст на английском языке. Выделить все различные слова.
//    Для каждого слова подсчитать часоту его встречаемости.Слова, отличающиеся регистром букв, считать разными.

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

    //6
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 25));
//        List<Integer> list2 = new ArrayList<>();
//        int count = 0;
//        int summ = 0;
//        int average=0;
//
//        for (int i = 0; i <list.size() ; i++) {
//            Integer number = list.get(i);
//            if (number % 5 == 0 & number % 2 != 0) {
//                count=++count;
//                summ = number+summ;
//                average=summ/count;
//            }
//        }
//        System.out.println(average);
//    }


    //7
//    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<>(Arrays.asList("words as", "words as", "song is ", "sometimes"));
//        Map<String, Integer> map = new TreeMap<>();
//        HashSet<String> set = new HashSet<>();
//        boolean countLetters;
//        for (int i = 0; i < array.size(); i++) {
//            String word = array.get(i);
//            Integer fraquancy = map.get(word);
//            map.put(word, fraquancy == null ? 1 : fraquancy + 1);
//        }
//        for (Map.Entry entry : map.entrySet()) {
//            Integer number = (Integer) entry.getValue();
//            Object value = entry.getValue();
//            Object key = entry.getKey();
//            if (number != 1) {
//                map.remove(key, value);
//            }
//        }
//        List<String> array2 = new ArrayList<>(map.keySet());
//        for (int y = 0; y < array2.size(); y++) {
//            if (countLetters = (array2.get(y).length() >= 8)) {
//                set.add(array2.get(y));
//            }
//        }
//        System.out.println(set);
//    }


    //8
    //  Дана Map <String, Integer>. Найти сумму всех значений, длинна ключей которых меньше 7 символов.
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        Integer myNumber = 7;
//        map.put("a1", 1);
//        map.put("aaaaaaa7", 7);
//        map.put("aaaaaaaaaa10", 10);
//        map.put("aaa3", 3);
//        Iterator <String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            if (key.length()>=myNumber){
//                iterator.remove();
//            }
//        }
//        List<Integer> list = new ArrayList<>(map.values());
//        Integer summ = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Integer number = list.get(i);
//            summ = summ + number;
//        }
//        System.out.println(summ);
//    }



}


