package class1;

// class Orang
// nama class selalu diawali huruf besar
public class Orang {
    // deklarasi properti/atribut
    public String namaDepan;
    public String namaBelakang;
    
    // method yang menghasilkan nilai balik
    // ciri: menyertakan jenis data yang akan dikembalikan
    // oleh method, contoh: String, Integer, boolean,...
    // terdapat juga perintah return untuk memberikan
    // nilai balik
    public String namaLengkap() {
        return this.namaDepan + " " + this.namaBelakang;
    }
    
    // method yang tidak menghasilkan nilai balik
    // ciri: menggunakan kata kunci void
    // tidak ada return
    public void sensor() {
        this.namaDepan = this.namaDepan.replace('a', '*');
        this.namaBelakang = this.namaBelakang.replace('a', '*');
    }
    
}
