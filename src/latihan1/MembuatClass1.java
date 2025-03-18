package latihan1;

class Persegi {
    public Integer panjang;
    public Integer lebar;
        
    public Integer luas() {
        return this.panjang * this.lebar;
    }
}

public class MembuatClass1 {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();
        kotak.panjang = 2;
        kotak.lebar = 3;
        
        System.out.println("Luas persegi:"+kotak.luas());
    }
}
