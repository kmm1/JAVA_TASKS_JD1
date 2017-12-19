package less19Pattern.animal;

/**
 * Created by Tom on 07.12.2017.
 */
public class BarkBehavior implements SoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Гав гав");
    }
}
