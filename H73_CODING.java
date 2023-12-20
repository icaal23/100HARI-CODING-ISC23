import java.util.*;
public class H73_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di sistem pembayaran pajak");
        System.out.print("Masukkan jumlah pajak yang harus dibayar: ");
        
        double jumlahPajak = input.nextDouble();

        boolean pembayaranSukses = prosesPembayaranPajak(jumlahPajak);

        if (pembayaranSukses) {
            System.out.println("Pembayaran pajak berhasil!");
        } else {
            System.out.println("Pembayaran pajak gagal. Silakan coba lagi.");
        }
    }
    private static boolean prosesPembayaranPajak(double jumlahPajak) {
        
        return Math.random() < 0.5;
    }
}
