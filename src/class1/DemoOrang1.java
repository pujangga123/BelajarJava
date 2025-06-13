/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class1;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class DemoOrang1 {
    public static void main(String[] args) {
        // membuat objek list
        // <Orang> menunjukan jenis data/class yang ditampung dalam list
        ArrayList<Orang> list = new ArrayList<Orang>();
        
        // membuat objek orang
        Orang data1 = new Orang();
        data1.namaDepan = "Budi"; // mengisi properti
        data1.namaBelakang = "Hendrawan";
        list.add(data1); // menambahkan objek ke dalam list
        
        Orang data2 = new Orang();
        data2.namaDepan = "Dyah";
        data2.namaBelakang = "Ayu";
        list.add(data2);
        
        // method get() digunakan untuk mengambil elemen dalam list
        System.out.println(list.get(0).namaDepan);
        System.out.println(list.get(1).namaDepan);
        
        System.out.println(list.get(0).namaDepan+" "+ list.get(0).namaBelakang);
        System.out.println(list.get(1).namaDepan+" "+ list.get(1).namaBelakang);
        
        // menggunakan method yang tidak memberikan nilai balik
        list.get(0).sensor();
        list.get(1).sensor();
        
        // menampilkan nama lewat method
        System.out.println(list.get(0).namaLengkap());
        System.out.println(list.get(1).namaLengkap());
    }
}
