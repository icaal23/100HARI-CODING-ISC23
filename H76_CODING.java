import java.util.*;
public class H76_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char jenisKelamin = input.next().charAt(0);

        System.out.println("Nama: " + nama);
        
        if (umur >= 18) {
            System.out.println("Anda sudah dewasa.");
        } else {
            System.out.println("Anda masih di bawah umur.");
        }

        if (jenisKelamin == 'L') {
            System.out.println("Anda adalah seorang laki-laki.");
        } else if (jenisKelamin == 'P') {
            System.out.println("Anda adalah seorang perempuan.");
        } else {
            System.out.println("Jenis kelamin tidak valid.");
        }
        
    }
}
