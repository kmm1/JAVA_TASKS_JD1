package less8StreamsLambdas;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Tom on 01.12.2017.
 */
public class Exersise {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        //1 Вернуть количество вхождений объекта «a1»
        long result = list.stream().filter((a) -> {
            return a.equals("a1");
        }).count();
        long result1 = list.stream().filter(a -> a.equals("a1")).count();
        long result2 = list.stream().filter("a1"::equals).count();
        System.out.println(result);

        //2 Вернуть первый элемент коллекции или 0, если коллекция пуста
        String result3 = list.stream().findFirst().orElse("0");
        System.out.println(result3);
        //3 Вернуть последний элемент коллекции или «empty», если коллекция пуста
        String result4 = list.stream().skip(list.size() - 1).findAny().orElse("empty");

        //4 Найти элемент в коллекции равный «a3» или кинуть ошибку
        try {
            String result5 = list.stream().filter(x -> x.equals("a5")).findFirst().get();
            System.out.println(result5);
        } catch (RuntimeException e) {
            System.out.println("такого элемента нет");
        }

        //5 Вернуть третий элемент коллекции по порядку
        String result6 = list.stream().skip(2).findFirst().get();
        System.out.println(result6);

        //6 Вернуть два элемента начиная со второго
        Object[] result7 = list.stream().skip(1).limit(2).toArray();
        System.out.println(Arrays.asList(result7));

        //7 Выбрать все элементы по шаблону
        List<String> result8 = list.stream().filter(x -> x.contains("a1")).collect(Collectors.toList());
        System.out.println(result8);
//8
        List<People> myList = new ArrayList<>(Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)));


        //8.1 Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        myList.stream().filter(p -> p.getAge() >= 18 && p.getAge() < 27 && p.getSex() == Sex.MAN).
                collect(Collectors.toList());

        //8.2 Найти средний возраст среди мужчин
        double averageAge = myList.stream().
                filter(p -> p.getSex() == Sex.MAN).
                mapToInt(p -> p.getAge()).
                average().getAsDouble();

        //8.3 Найти кол-во потенциально работоспособных людей в выборке
        // (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)

        myList.stream().filter((p) -> p.getAge() >= 18).
                filter((p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55)
                        || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();

        //9
        Collection ordered = Arrays.asList("a1", "a2", "a2", "a", "a1", "a2", "a2");
        Collection nonOrdered = new HashSet<>(ordered);
        //9.1 Получение коллекции без дубликатов из неупорядоченного стрима
        List<String> list1 = (List<String>) nonOrdered.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
       //9.2 Получение коллекции без дубликатов из упорядоченного стрима
        List<String> list2 = (List<String>) ordered.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
    }

}


class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}


enum Sex {
    MAN, WOMEN
}


