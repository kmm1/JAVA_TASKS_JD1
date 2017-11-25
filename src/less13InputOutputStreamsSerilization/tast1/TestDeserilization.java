package less13InputOutputStreamsSerilization.tast1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Tom on 25.11.2017.
 */
public class TestDeserilization {
    public static void main(String[] args) {

        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(
                             new FileInputStream("less13task1serialization.bin"))) {
//            Computer[] computers = (Computer[]) objectInputStream.readObject();
//            System.out.println(computers[0]);
            Notebook[] notebooks = (Notebook[]) objectInputStream.readObject();
            System.out.println(notebooks[0]);
            System.out.println(notebooks[1]);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
