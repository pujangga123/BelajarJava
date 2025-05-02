package latihan1;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile3 {

    public static void main(String[] args) {
        try {
            ArrayList list = new ArrayList();
            
            File myObj = new File("src/latihan1/test1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                Integer data = Integer.valueOf(myReader.nextLine());
                list.add(data);
            }
            
            list.sort(null);
            System.out.println(list);
            
            System.out.println("Nilai terkecil: "+list.get(0));
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
