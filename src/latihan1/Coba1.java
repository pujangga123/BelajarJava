package latihan1;
import java.util.Scanner;

public class Coba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        try {
            System.out.print("A? ");
            n1 = scan.nextInt();

            System.out.print("B? ");
            n2 = scan.nextInt();

            System.out.print("A x B = "+(n1*n2));
        } catch (Exception e) {
            System.out.println("Anda memasukan input yang salah");
            System.out.println("Pesan error"+e.getMessage());
        }

        scan.close();
    }
}

