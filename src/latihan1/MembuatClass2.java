package latihan1;

class Persegi {
    public Integer panjang;
    public Integer lebar;
    
    // constructor
    public Persegi(Integer p, Integer l) {
        this.panjang = p;
        this.lebar = l;
    }
    
    public Integer luas() {
        return this.panjang * this.lebar;
    }
}

public class MembuatClass2 {
    public static void main(String[] args) {
        Persegi kotak = new Persegi(2,3);
        System.out.println("Luas persegi:"+kotak.luas());
    }
}
