package less19Pattern.animal;

/**
 * Created by Tom on 07.12.2017.
 */
public abstract class Animal {
    SoundBehavior soundBehavior;

    public Animal() {
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public void makeSound() {
        soundBehavior.makeSound();
    }

}
