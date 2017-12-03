package less8StreamsLambdas;

//1
//Дан список целых чисел. Найти средне всех нечетных чисел, делящихся на 5.

//   2
//Дан список строк. Найти кол-во уникальных строк длинной более 8 символов.

//  3
//  Дана Map <String, Integer>. Найти сумму всех значений, длинна ключей которых меньше 7 символов.

//  4
// Дан список целых чисел. Вывести строку представляющую собой конкатенацию строковых представлений эих чисел.
// Пример: список {5,2,4,2,1} Результатирующая строка: "52421"

//5
// Дан класс Person с полями firstName, lastName, age.
//Вывести полное имя самого старшего человека, у которого длина этого имени не привышает 15 символов

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class StreamsLambdas {
    //1
//Дан список целых чисел. Найти средне всех нечетных чисел, делящихся на 5.
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20);
//        OptionalDouble a = list.stream().
//                filter(num -> num % 2 != 0).
//                filter(num -> num % 5 == 0).
//                mapToInt(num -> num).
//                average();
//        System.out.println(a);
//    }

    //   2
//Дан список строк. Найти кол-во уникальных строк длинной более 8 символов.
//    public static void main(String[] args) {
//        long count = Stream.of("aaa4", "aaaaaaaa9", "aaaaa6", "aaaaaaaa9", "aaaaaaaaaa11").
//                filter(x -> x.length() > 8).count();
//        System.out.println(count);
//    }

    //  3  ????
//  Дана Map <String, Integer>. Найти сумму всех значений, длинна ключей которых меньше 7 символов.
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("bb", 2);
//        map.put("ccccccc", 7);
//    }


    //  4??????
// Дан список целых чисел. Вывести строку представляющую собой конкатенацию строковых представлений эих чисел.
// Пример: список {5,2,4,2,1} Результатирующая строка: "52421"
//    public static void main(String[] args) {
//        Stream.of(5,2,4,2,1).forEach(System.out::print);
//        int [] num = {5,4,3,2,1};
//        System.out.println(Arrays.toString(num));
//        List<Integer> list = new ArrayList<>(Arrays.asList(5,4,3,2,1));
//        for (Integer x:list) {
//            System.out.print(x);
//        }
//    }


}
