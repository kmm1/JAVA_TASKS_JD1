package collections;

import java.util.*;

/**
 * Created by Tom on 05.10.2017.
 */
public class Comporator {
    public static void main(String[] args) {

        class Actor {
            private String firstName;
            private String lastName;
            private int fee;
            private int age;

            public Actor(String firstName, String lastName, int fee, int age) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.fee = fee;
                this.age = age;
            }

            public String getFullName() {
                return firstName + " " + lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public int getFee() {
                return fee;
            }

            public int getAge() {
                return age;
            }
        }

        class ByFeeComparator implements Comparator<Actor> {
            @Override
            public int compare(Actor firstActor, Actor secondActor) {
                return new Integer(firstActor.getFee()).compareTo(secondActor.getFee());
            }
        }

        class ByAgeComparator implements Comparator<Actor> {
            @Override
            public int compare(Actor firstActor, Actor secondActor) {
                return new Integer(firstActor.getAge()).compareTo(secondActor.getAge());
            }
        }

        class ByFullNameComparator implements Comparator<Actor> {
            @Override
            public int compare(Actor firstActor, Actor secondActor) {
                return firstActor.getFullName().compareTo(secondActor.getFullName());
            }
        }


        List<Actor> actorsList = new ArrayList<>();
        actorsList.add(new Actor("A", "AA", 500, 25));
        actorsList.add(new Actor("B", "BB", 600, 30));
        actorsList.add(new Actor("D", "DD", 400, 45));
        actorsList.add(new Actor("C", "CC", 100, 30));

        Collections.sort(actorsList, new ByFeeComparator());
        for (Actor actors : actorsList) {
            System.out.println(actors.getFirstName());
        }

        Collections.sort(actorsList, new ByFullNameComparator());
        for (Actor actors : actorsList) {
            System.out.println(actors.getFullName());
        }

        Comparator<Actor> ByAgeAndFeeComparator = new ByAgeComparator().thenComparing(new ByFeeComparator());
        for (Actor actors : actorsList) {
            System.out.println(actors.getFullName() + " " + actors.getAge() + " " + actors.getFee());
        }
    }
}