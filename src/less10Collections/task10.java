package less10Collections;

import java.util.*;

// Дан класс Person с полями firstName, lastName, age.
//Вывести полное имя самого старшего человека, у которого длина этого имени не привышает 15 символов
public class task10 {
    public static void main(String[] args) {
        Person person1 = new Person("Kate", "Mikhalionak", 26);
        Person person2 = new Person("Volodya", "Gavrilionak", 35);
        Person person3 = new Person("Steta", "Gardishenya", 40);
        Person person4 = new Person("Vitalii", "Visockii", 40);
        Person person5 = new Person("OksanaOksanaOksana", "Petrova", 46);

        List<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Person personName = (Person) iterator.next();
            if (personName.getName().length() > 15) {
                iterator.remove();
            }
        }
        Collections.sort(list, new ByAgeComparator());
        Person personWithMaxAge = list.get(list.size()-1);
        for (Person person : list) {
            if (person.getAge() == personWithMaxAge.age)
                System.out.println(person.getFullNAme());
        }
    }

    static class ByAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return new Integer(person1.getAge()).compareTo(person2.getAge());
        }
    }


    static class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFullNAme() {
            return lastName + " " + firstName;
        }
        public String getName(){
            return firstName;
        }

        public int getAge() {
            return age;
        }
    }


}
