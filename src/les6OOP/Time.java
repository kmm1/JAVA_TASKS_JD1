package les6OOP;

import static les6OOP.Time.timeInSecMinHour;
import static les6OOP.Time.timeInSeconds;

//Создайте класс описывающий промежуток времени.
//Сам промежуток времени должен задаваться 3 свойствами: секундами минутами часами.
//Создать метод для получения полного количества секунд в объекте.
//Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
//Создать метод для вывода данных. Написать программу для тестирования возможностей класса.

public class Time {
    private int sec;
    private int min;
    private int hour;

    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Time(int sec) {
        this.sec = sec;
    }

    public static int timeInSeconds(Time time) {
        int result = time.sec + time.getMin() * 60 + time.getHour() * 3600;
        return result;
    }

    public static void timeInSecMinHour(Time time) {
        int hour = time.getSec() / 3600;
        int secDataEntry2 = time.getSec() % 3600;
        int min = secDataEntry2 / 60;
        int sec = secDataEntry2 % 60;
        System.out.println("часы : " + hour + " минуты: " + min + " секунды:" + sec);
    }
}

class Test {
    public static void main(String[] args) {
        Time time = new Time(50, 40, 5);
        System.out.println(timeInSeconds(time));
        System.out.println(timeInSeconds(new Time(1, 2, 1)));

        Time anotherTime = new Time(1);
        timeInSecMinHour(anotherTime);
        timeInSecMinHour(new Time(56));
    }
}
