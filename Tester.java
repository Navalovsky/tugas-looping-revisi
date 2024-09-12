import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa objek yg dibuat? (Max 10)");
        int jumlah = in.nextInt();
        System.out.println("CD atau DVD?");
        String pilihan = in.next();

        if (pilihan.equals("CD")) {
          
            for (int i = 0; i < jumlah; i++) {
                CD c = new CD();
                System.out.println("CD " + (i + 1) + ":");
                c.print();
            }
        } else if (pilihan.equals("DVD")) {
            
            for (int i = 0; i < jumlah; i++) {
                DVD d = new DVD();
                System.out.println("DVD " + (i + 1) + ":");
                d.print();
            }
        } else {
            System.out.println("Input Salah.");
        }
        
        in.close();
    }
    
}
