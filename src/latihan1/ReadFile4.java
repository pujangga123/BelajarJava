/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFile4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            File myObj = new File("src/belajarjava/test1.txt");
            try (Scanner myReader = new Scanner(myObj)) {
                double sum = 0.0;
                int evenCount = 0;
                int oddCount = 0;

                while (myReader.hasNextLine()) {
                    Integer data = Integer.valueOf(myReader.nextLine());
                    list.add(data);
                    sum += data;
                    if (data % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }

                Collections.sort(list);

                System.out.println(list);
                System.out.println("Nilai terkecil: " + list.get(0));
                System.out.println("Nilai terbesar: " + list.get(list.size() - 1));
                double average = sum / list.size();
                System.out.println("Rata-rata: " + average);
                System.out.println("Banyak bilangan genap: " + evenCount);
                System.out.println("Banyak bilangan ganjil: " + oddCount);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}