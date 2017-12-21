package less19Pattern.factory.фабричныйМетодЧасы;

import java.util.Date;

/**
 * Created by Tom on 21.12.2017.
 */
public class FacricMethod {
    public static void main(String[] args) {
        Creator creator = getCreatorByName("Digital");
        Watch watch = creator.create();
        watch.showTime();

    }

    public static Creator getCreatorByName(String name) {
        if (name == "Roman") {
            return new RomanWatchCreator();
        } else if (name == "Digital") {
            return new DigitalWatchCreator();
        } else throw new RuntimeException("не поддерживается линия " + name);
    }


    interface Watch {
        void showTime();
    }

    static class RomanWatch implements Watch {
        @Override
        public void showTime() {
            System.out.println("XX-||");
        }
    }

    static class DigitalWatch implements Watch {
        @Override
        public void showTime() {
            System.out.println(new Date());
        }
    }

    interface Creator {
        Watch create();
    }

    static class DigitalWatchCreator implements Creator {
        @Override
        public Watch create() {
            return new DigitalWatch();
        }
    }

    static class RomanWatchCreator implements Creator {

        @Override
        public Watch create() {
            return new RomanWatch();
        }
    }
}
