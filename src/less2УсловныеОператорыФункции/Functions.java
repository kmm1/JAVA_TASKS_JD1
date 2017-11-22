package less2УсловныеОператорыФункции;

import java.util.*;

//1 Запросить у пользователя 2 слова. Если они одинаковы - вывести 'Отлично! Слова одинаковы!'.
// Если они отличаются регистром - "Хорошо. Почти одинаковы". Если они отличаются, но одной длины - "Ну хотя бы они одной длины".
// Использовать методы класса String:equals(), equalsIgnoreClass(), length().

//2
//Иммется целое число вводимое пользователем с консоли. Это число  - сумма денег в рублях.
// Вывести это число добавив к нему слово "рубль" в правильном падеже. ("рубль","рублей","рубля")
// a) использовать конструкцию if-else  б) модифицировать в switch в отдельном файле.

//3
// Имеются два дома размерами a на b и c на d.
// Размеры вводятся пользователями с консоли. Проверить помещаются ли эти два дома на участке размером e на f.
//Стороны домов - параллельны сторонам участка, а в остальном размещение может быть любое.

//4
// Написать программу вычисляющую корни квадратного уравнения вида ax2+bx+c=0, где a, b, c вводимые пользователем из консоли данные.
// Учитывать только реальные корни. В случае отрицательного дискрименанта выводить сообщение пользователю).
// При решении создать и использовать следующие вынесенные функции:
// isPositive - определяющая является ли число положительным
//isZero - определяющая является ли число нулем.
//discriminant - вычисляющая дискриминант

//5
//Написать программу которая считывает число месяц и год, введенные пользователем в виде трех целых чисел.
//Программа дорлжна определить является ли дата реальной и вывести результат. Использовать информвцию:
//январь, март, май, июль, август, октябрь, декабрь -31 день.
// апрель, июнь, сентябрь, ноябрь - 30 дней.
//февраль - 28 дней в обычном году, 298 дней в високосном году.


//6
// Имеются 3 числа - день, месяц и год вводимые пользователем с консоли.
// Вывести дату СЛЕДУЮЩЕГО дня в формате "День.Месяц.Год".
// Учесть переход на слкдующий месяц а также на следующий год.
// Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.

//7
//Имеется промежуток времени в секундах. Следует его вывести в виде часов, минут и секунд.

//8
//Имеется целое число. Надо подсчитать сумму цифр данного числа.

//9
//Посчитать сумму чисел от 1 до 200

//10
//Вывести на экран первые 10 чисел которые делятся на 3 без остатка.

//11
//Вывести таблицу умножения

//12
//Числами Фибиначи называют числовую последовательность (1,1,2,3,5,8,13,21,34...)в которой каждое число начиная
// с 3-го является суммой двух предыдущих.
// Написать метод который получает целочисленный аргумент и выводит указонное кол-во чисел Фибиначи.

//13
//Вампирами называют числа состоящие из четного кол-ва цифр и полученные переумножением пары чмсел
// каждое из которых содержит половину результата.
// Цифры берутся из исходного числа в произвольном порядке. Завершающие нули недопустимы.


public class Functions {

    //1
    // Запросить у пользователя 2 слова. Если они одинаковы - вывести 'Отлично! Слова одинаковы!'.
    // Если они отличаются регистром - "Хорошо. Почти одинаковы". Если они отличаются, но одной длины - "Ну хотя бы они одной длины".
    // Использовать методы класса String:equals(), equalsIgnoreClass(), length().

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое слово:");
//        String firstWord = scanner.nextLine();
//        System.out.println("Введите второе слово:");
//        String secondWord = scanner.nextLine();
//        string(firstWord, secondWord);
//    }
//
//    private static String string(String firstWord, String secondWord) {
//        if (firstWord.equals(secondWord)) {
//            System.out.println("Отлично! Слова одинаковы!");
//        } else if (firstWord.equalsIgnoreCase(secondWord)) {
//            System.out.println("Хорошо. Почти одинаковы");
//
//        } else if (firstWord.length() == secondWord.length()) {
//            System.out.println("Ну хотя бы они одной длины");
//        } else
//            System.out.println("Эх, они разные");
//
//        return null;
//    }

    //2
    //Иммется целое число вводимое пользователем с консоли. Это число  - сумма денег в рублях.
    // Вывести это число добавив к нему слово "рубль" в правильном падеже. ("рубль","рублей","рубля")
    // a) использовать конструкцию if-else  б) модифицировать в switch в отдельном файле.
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String number = scanner.next();
//        if (number.equals(11) || number.equals(12) || number.equals(13) || number.equals(14)
//                || number.endsWith("0") || number.endsWith("5") || number.endsWith("6") || number.endsWith("7") || number.endsWith("8")
//                || number.endsWith("9")) {
//            System.out.println(number + " рублей");
//        } else if (number.endsWith("2") || number.endsWith("3") || number.endsWith("4")) {
//            System.out.println(number + " рубля");
//        } else if (number.endsWith("1")) {
//            System.out.println(number + " рубль");
//        }
//
//        switch (number) {
//            case "11":
//            case "12":
//            case "13":
//            case "14":
//                System.out.println(number + " рублей");
//                break;
//            case number.equals("k"):
//        }
//    }


    //3
    // Имеются два дома размерами a на b и c на d.
    // Размеры вводятся пользователями с консоли. Проверить помещаются ли эти два дома на участке размером e на f.
    //Стороны домов - параллельны сторонам участка, а в остальном размещение может быть любое.

    //4
    // Написать программу вычисляющую корни квадратного уравнения вида ax2+bx+c=0, где a, b, c вводимые пользователем из консоли данные.
    // Учитывать только реальные корни. В случае отрицательного дискрименанта выводить сообщение пользователю).
    // При решении создать и использовать следующие вынесенные функции:
    // isPositive - определяющая является ли число положительным
    //isZero - определяющая является ли число нулем.
    //discriminant - вычисляющая дискриминант

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите a");
//        double a = scanner.nextDouble();
//        System.out.println("Введите b");
//        double b = scanner.nextDouble();
//        System.out.println("Введите c");
//        double c = scanner.nextDouble();
//
//        System.out.println("дискриминант: " + discriminant(a, b, c));
//        if (isZero(discriminant(a, b, c))) {
//            double answer = (-b + Math.sqrt(discriminant(a, b, c)) / 2 * a);
//            System.out.println("Ответ x = " + answer);
//        } else if (isPositive(discriminant(a, b, c))) {
//            double answer1 = (-b + Math.sqrt(discriminant(a, b, c)) / 2 * a);
//            double answer2 = (-b - Math.sqrt(discriminant(a, b, c)) / 2 * a);
//            System.out.println("Ответ x1 = " + answer1 + ", x2 = " + answer2);
//        } else System.out.println("Корней нет");
//    }
//    private static boolean isPositive(double discriminant) {
//        if (discriminant > 0) {
//            return true;
//        }
//        return false;
//    }
//    private static boolean isZero(double discrimenant) {
//        if (discrimenant == 0) {
//            return true;
//        }
//        return false;
//    }
//    private static double discriminant(double a, double b, double c) {
//        double discriminant = Math.pow(b, 2) - 4 * a * c;
//        return discriminant;
//    }

    // 4
    // Написать программу которая считывает год, введеный пользователем и определяет является ли он високосным.
    // Год считается високосным если он делится без остатка на 4. Однако если год ТАСКЖН делится на 100 то этот год не високосный,
    // за исключением годов делящихся на 400.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Integer myYear = scanner.nextInt();
//        if (myYear % 400 == 0)  {
//            System.out.println(myYear + " високосный год");
//        } else if (myYear%4==0 && myYear%100!=0){
//            System.out.println(myYear + " високосный год");
//        } else System.out.println(myYear + " невисокосный год");
//    }

    //5
    //Написать программу которая считывает число месяц и год, введенные пользователем в виде трех целых чисел.
    //Программа дорлжна определить является ли дата реальной и вывести результат. Использовать информвцию:
    //январь, март, май, июль, август, октябрь, декабрь -31 день.
    // апрель, июнь, сентябрь, ноябрь - 30 дней.
    //февраль - 28 дней в обычном году, 298 дней в високосном году.


    //6
    // Имеются 3 числа - день, месяц и год вводимые пользователем с консоли.
    // Вывести дату СЛЕДУЮЩЕГО дня в формате "День.Месяц.Год".
    // Учесть переход на слкдующий месяц а также на следующий год.
    // Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.

    //7
    //Имеется промежуток времени в секундах. Следует его вывести в виде часов, минут и секунд.
//    public static void main(String[] args) {
//        int secDataEntry = 5007;
//        int hour = secDataEntry / 3600;
//        int secDataEntry2 = secDataEntry % 3600;
//        int min = secDataEntry2 / 60;
//        int sec = secDataEntry2 % 60;
//        System.out.println("часы: " + hour + "минуты: " + min + "секунды:" + sec);
//    }

    //8
    //Имеется целое число. Надо подсчитать сумму цифр данного числа.
//    public static void main(String[] args) {
//        int n;
//        int sum = 0;
//        System.out.print("Bвод натурального числа - ");
//        Scanner sr = new Scanner(System.in);
//        n = sr.nextInt();
//        while (n != 0) {
//            //Суммирование цифр числа
//            sum += (n % 10);
//            n /= 10;
//        }
//        System.out.println(sum);
//    }

    //9
    //Посчитать сумму чисел от 1 до 200
//    public static void main(String[] args) {
//        int summ = 0;
//        for (int i = 1; i < 200 + 1; i++) {
//            summ = summ + i;
//        }
//        System.out.println(summ);
//
//        int i = 1;
//        int summ2 = 0;
//        while (i < 201) {
//            summ2 += i;
//            i++;
//        }
//        System.out.println(summ2);
//   }


    //10
//Вывести на экран первые 10 чисел которые делятся на 3 без остатка.
//    public static void main(String[] args) {
//        int count = 0;
//        int number = 1;
//        int result = 0;
//        while (count != 10) {
//            if (number % 3 == 0) {
//                System.out.println(number);
//                count++;
//            }
//            number++;
//        }


    //11
    //Вывести таблицу умножения
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i * j + " ");
//            }
//            System.out.println("");
//        }
//    }

    //12
    //Числами Фибиначи называют числовую последовательность (1,1,2,3,5,8,13,21,34...)в которой каждое число начиная
    // с 3-го является суммой двух предыдущих.
    // Написать метод который получает целочисленный аргумент и выводит указонное кол-во чисел Фибиначи.
//    public static void main(String[] args) {
//       fibinachi(5);
//    }
//    private static void fibinachi(int n) {
//        int result = 0;
//        System.out.println(1);
//        System.out.println(1);
//        for (int i = 1; i < n - 1; i++) {
//            int firstNumber = i;
//            int secondNumber = firstNumber;
//            System.out.println(secondNumber+firstNumber);
//        }
//        return;
//    }

    //13
//Вампирами называют числа состоящие из четного кол-ва цифр и полученные переумножением пары чмсел
// каждое из которых содержит половину результата.
// Цифры берутся из исходного числа в произвольном порядке. Завершающие нули недопустимы.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> result = new HashSet<>();
        int count = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int forthNumber = 0;

        for (int i = 1000; i < 10000; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            int entryNumber = list.get(i);
            firstNumber = entryNumber % 10;
            secondNumber = (entryNumber / 10) % 10;
            thirdNumber = (entryNumber / 100) % 10;
            forthNumber = (entryNumber / 1000) % 10;
            count = 0;
            if (firstNumber == 0) {
                count++;
            }
            if (secondNumber == 0) {
                count++;
            }
            if (thirdNumber == 0) {
                count++;
            }

            if (forthNumber == 0) {
                count++;
            }
            if (count >= 2) {
                continue;
            } else {
                String case1 = String.valueOf((firstNumber) + String.valueOf(secondNumber));
                String case2 = String.valueOf((firstNumber) + String.valueOf(thirdNumber));
                String case3 = String.valueOf((firstNumber) + String.valueOf(forthNumber));
                String case4 = String.valueOf((secondNumber) + String.valueOf(firstNumber));
                String case5 = String.valueOf((secondNumber) + String.valueOf(thirdNumber));
                String case6 = String.valueOf((secondNumber) + String.valueOf(forthNumber));
                String case7 = String.valueOf((thirdNumber) + String.valueOf(firstNumber));
                String case8 = String.valueOf((thirdNumber) + String.valueOf(secondNumber));
                String case9 = String.valueOf((thirdNumber) + String.valueOf(forthNumber));
                String case10 = String.valueOf((forthNumber) + String.valueOf(firstNumber));
                String case11 = String.valueOf((forthNumber) + String.valueOf(secondNumber));
                String case12 = String.valueOf((forthNumber) + String.valueOf(thirdNumber));

                Integer multiplication1 = Integer.valueOf(case11) * Integer.valueOf(case7);
                if (multiplication1 == entryNumber) {
                    result.add(multiplication1);
                }
                Integer multiplication2 = Integer.valueOf(case1) * Integer.valueOf(case9);
                if (multiplication2 == entryNumber) {
                    result.add(multiplication2);
                }
                Integer multiplication3 = Integer.valueOf(case1) * Integer.valueOf(case12);
                if (multiplication3 == entryNumber) {
                    result.add(multiplication3);
                }
                Integer multiplication4 = Integer.valueOf(case2) * Integer.valueOf(case6);
                if (multiplication4 == entryNumber) {
                    result.add(multiplication4);
                }
                Integer multiplication5 = Integer.valueOf(case2) * Integer.valueOf(case11);
                if (multiplication5 == entryNumber) {
                    result.add(multiplication5);
                }
                Integer multiplication6 = Integer.valueOf(case3) * Integer.valueOf(case5);
                if (multiplication6 == entryNumber) {
                    result.add(multiplication6);
                }
                Integer multiplication7 = Integer.valueOf(case3) * Integer.valueOf(case8);
                if (multiplication7 == entryNumber) {
                    result.add(multiplication7);
                }
                Integer multiplication8 = Integer.valueOf(case4) * Integer.valueOf(case9);
                if (multiplication8 == entryNumber) {
                    result.add(multiplication8);
                }
                Integer multiplication9 = Integer.valueOf(case4) * Integer.valueOf(case12);
                if (multiplication9 == entryNumber) {
                    result.add(multiplication9);
                }
                Integer multiplication10 = Integer.valueOf(case10) * Integer.valueOf(case5);
                if (multiplication10 == entryNumber) {
                    result.add(multiplication10);
                }
                Integer multiplication11 = Integer.valueOf(case10) * Integer.valueOf(case8);
                if (multiplication11 == entryNumber) {
                    result.add(multiplication11);
                }
                Integer multiplication12 = Integer.valueOf(case7) * Integer.valueOf(case6);
                if (multiplication12 == entryNumber) {
                    result.add(multiplication12);
                }
            }
        }
        System.out.println("--------------");
        System.out.println(result);
        }


    }






