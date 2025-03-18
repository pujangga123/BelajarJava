package latihan1;

public class Casting1 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        String c = "3";
        String d = "4";
        
        // penjumlahan integer
        System.out.println(a+a);
        // casting integer to string
        System.out.println(a.toString()+b.toString());
        
        // penjumlahan string (concatenate)
        System.out.println(c+d);
        // casting string to integer
        System.out.println(Integer.parseInt(c) + Integer.parseInt(d));
        
        
    }
}
