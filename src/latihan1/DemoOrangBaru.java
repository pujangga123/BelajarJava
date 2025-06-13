/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

public class DemoOrangBaru {

    public static void main(String[] args) {
        String nama = "999";
        Integer usia = 0;

        try {
            OrangBaru orang1 = new OrangBaru(nama, usia);
            orang1.panggilan();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
