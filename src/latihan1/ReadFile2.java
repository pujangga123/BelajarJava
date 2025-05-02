package latihan1;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile2 {

    public static void main(String[] args) {
        try {
            ArrayList list = new ArrayList();
            File myObj = new File("src/latihan1/test1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();
            list.sort(null);
            System.out.println(list);
            System.out.println(list.get(list.size()-1));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
