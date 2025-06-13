package latihan1;

import java.io.FileWriter;
import java.io.IOException;

public class GeneratorData1 {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("src/latihan1/data1.txt");
            for (int i = 1; i <= 30; i++) {
                long low = Math.round(Math.random() * 15)+10; 
                long high = Math.round(Math.random() * (30-low) )+low; //irgi
                writer.write(i + "," + low+ ","+high+  "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
