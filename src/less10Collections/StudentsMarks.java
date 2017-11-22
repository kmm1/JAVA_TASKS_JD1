package less10Collections;

import java.util.*;

//Создать список оценок учеников с помощью ArrayList.
//Заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
public class StudentsMarks {
    public static void main(String[] args) {

        //1
//        List<Integer> StudentsMarks = new ArrayList<>(Arrays.asList(3, 5, 8, 4, 8, 2, 6));
//        Integer maxMark = 0;
//        for (int i = 0; i < StudentsMarks.size(); i++) {
//            if (StudentsMarks.get(i) > maxMark) {
//                maxMark = StudentsMarks.get(i);
//            }
//        }
//        System.out.println(maxMark);

        //2
//        List<Integer> StudentsMarks = new ArrayList<>(Arrays.asList(3, 5, 8, 4, 8, 2, 6));
//        Iterator<Integer> Iterator = StudentsMarks.Iterator();
//        Integer maxMark = 0;
//        while (Iterator.hasNext()) {
//            Integer nextMark = Iterator.next();
//            if (maxMark < nextMark) {
//                maxMark = nextMark;
//            }
//            System.out.println(maxMark);
//        }

        //3
        ArrayList<Integer> studentMarks = new ArrayList<>(Arrays.asList(3, 8, 5, 3, 4, 8, 2, 6));
        Collections.sort(studentMarks, new Comparator<Integer>() {
            public int compare(Integer firstMark, Integer secondMark) {
                return firstMark.compareTo(secondMark);
            }
        });
        Integer listSize = studentMarks.size();
        System.out.println(studentMarks.get(listSize - 1));
    }
}

