package less4Args;

import java.util.Arrays;

/**
 * Created by Tom on 23.11.2017.
 */

public class Less4Args {

    //1 занести в массив первые 100 чисел делящихся на 13 или 17
//    public static void main(String[] args) {
//        int [] result = new int [100];
//        int index =0;
//        for (int i = 1; i <766 ; i++) {
//            if (i % 17 == 0 || i%13==0) {
//                result[index]=i;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(result));
//    }

    //Заполнение массива случайными числами
//    public static void main(String[] args) {
//        int array[] = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.random() * 10 + 1;
//        }
//    }

    //Нахождение max элемента. Вывести не сам max элемент а его номер
//    public static void main(String[] args) {
//        int array[] = {5, 9, 6, 7, 1, 1};
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
//        System.out.println(Arrays.toString(array));
//    }

    //Получить индекс и значение
//    public static void main(String[] args) {
//        int array[] = {5, 9, 4, 4};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + " = " + array[i]);
//        }
//    }

    // Подсчитать сумму в массиве
//    public static void main(String[] args) {
//        int array[] = {1, 2, 3, 4};
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            summ += array[i];
//        }
//        System.out.println(summ);
//    }

    // Определить сумму элементов массива рассположенных между минимальными и максимальными значениями
//    public static void main(String[] args) {
//        int array[] = {1, 6, 2, 7, 7, 1};
//        int[] newArray = new int[array.length];
//        Arrays.sort(array);
//        int max = array[0];
//        int min = array[array.length - 1];
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != max && array[i] != min) {
//                newArray[i] = array[i];
//            }
//        }
//        for (int j = 0; j < newArray.length; j++) {
//            summ += newArray[j];
//        }
//        System.out.println(Arrays.toString(newArray));
//        System.out.println(summ);
//    }

    // Создать массив. Заполнить его случайными числами. Расспечатать. Перевернуть. Снова распечатать.
    public void sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            int a = (int) (Math.random() * 10+1);
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
        Less4Args m = new Less4Args();
        m.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
