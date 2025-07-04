package crud;

public class DemoMahasiswa1 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim="2000001";
        mahasiswa.nama = "Budianto";
        mahasiswa.nilai = 20;
        if(mahasiswa.tambah()==true) {
            System.out.println("Data berhasil ditambahkan");
        } else {
            System.out.println("GAGAL");
        }
        
    }
}
