package latihan1;

import java.io.FileWriter;
import java.io.IOException;

public class RandomNumberWriter {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("src/latihan1/test1.txt")) {
            for (int i = 0; i < 100; i++) {
                long randomNumber = Math.round(Math.random() * 1000); 
                writer.write(randomNumber + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
