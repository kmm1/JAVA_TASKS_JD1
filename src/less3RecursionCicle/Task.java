package less3RecursionCicle;


import javax.management.ObjectName;
import java.util.*;

public class Task {
    //В 1626 году индейцы Канарси продали Манхеттен за $24.
//Написать программу которая высчитывает сумму получившуюся бы в текущем году если бы индейцы
// положили эти деньги под 5% годовых.
//    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//
//        countSumm(calendar.get(Calendar.YEAR), 1626, 24, 0.05);
//    }
//    public static void countSumm(int yearCurrent, int yearInput, double summInput, double rate) {
//        for (int i = yearInput; i < yearCurrent + 1; i++) {
//            double persentsPerYear =summInput*0.05;
//            summInput=summInput+persentsPerYear;
//        }
//        System.out.println(summInput);
//    }

    //Написать программу определяющую является ли введенное целое число простым,
    // те делится без остатка только на 1 и само на себя.

//    public static void main(String[] args) {
//        int n = 17;
//        System.out.println(isSimple(48));
//    }
//        public static boolean isSimple (int n){
//        for (int i = 2; i <n ; i++) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

    //Написать программу вычисляющую факториал введенного целого числа. Напимер 5! = 1*2*3*4*5=120.
    //Нужно 2 варианта: с циклом и рекурсией.

//    public static void main(String[] args) {
//        int inputNumber = 5;
//        int result = 1;
//        for (int i = 2; i < inputNumber + 1; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//        System.out.println(factorial(inputNumber));
//    }
//
//    public static int factorial(int n) {
//        if (n == 0) return 1;
//        return n * factorial(n - 1);
//    }


    //Написать программу вычисляющую сумму цифр введенного пользователем целого числа.

//    public static void main(String[] args) {
//        int enteredNumber = 135;
//        int result = 0;
//        while (enteredNumber > 0) {
//            result += enteredNumber % 10;
//            enteredNumber = enteredNumber / 10;
//        }
//        System.out.println(result);
//    }

    //Написать программу отображающую статистику по осадкам за N дней. N вводится пользователем.
    // Пользователь также должен ввести N целых чисел обозначающих величину осадков в день.
    //Программа должна выводить: 1 кол-во дней,
    //2 сумму осадков за этот период,
    //3 среднее кол-во осадков за этот период,
    //4 максимальное количество дневных осадков за этот период
    //Не использовать массивы.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Integer days = scanner.nextInt();
//        Double precipitationSumm = 0.0;
//        Double precipitationAverage = 0.0;
//        Double precipitationMax = 0.0;
//
//        ArrayList<Double> precipitationStatistics = new ArrayList();
//        for (int i = 1; i < days + 1; i++) {
//            System.out.println("Введите кол-во осадков за " + i + " день");
//            Double precipitation = scanner.nextDouble();
//            precipitationStatistics.add(precipitation);
//        }
//        for (int i = 0; i < precipitationStatistics.size(); i++) {
//            precipitationSumm += precipitationStatistics.get(i);
//        }
//        precipitationAverage = precipitationSumm / days;
//        Collections.sort(precipitationStatistics, new Comparator<Double>() {
//            @Override
//            public int compare(Double firstNumber, Double secondNumber) {
//                return firstNumber.compareTo(secondNumber);
//            }
//        });
//        precipitationMax = precipitationStatistics.get(precipitationStatistics.size() - 1);
//        System.out.println("Количество дней: " + days + "\nCумма осадков за этот период " + precipitationSumm + "\nСреднее кол-во осадков за этот период " + precipitationAverage + "\nМаксимальное количество дневных осадков за этот период" + precipitationMax);
//
//    }

}