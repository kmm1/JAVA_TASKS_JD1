package less13InputOutputStreamsSerilization.tast1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Tom on 25.11.2017.
 */
public class TestSerialization {
    public static void main(String[] args) {
        Computer computer1 = new Computer("model10", 2017);
        Computer computer2 = new Computer("model20", 2017);
        Computer[] computers =
                {new Computer("model10", 2017),
                        new Computer("model10", 2017)};

        Notebook[] notebooks = {new Notebook("model1", 2004, new TouchPad("model", 2011, "string"), "transientField"),
                new Notebook("model2", 2004, new TouchPad("model", 2011, "string"), "transientField")};
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("less13task1serialization.bin"))) {
           // objectOutputStream.writeObject(computers);
            objectOutputStream.writeObject(notebooks);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}