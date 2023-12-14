import java.util.Scanner;
public class H67_CODING {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan suatu bilangan bulat
        System.out.print("Masukkan suatu bilangan bulat: ");
        int number = input.nextInt();

        // Menggunakan struktur kontrol if-else untuk menentukan jenis bilangan
        if (number > 0) {
            System.out.println("Bilangan positif");
        } else if (number < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Nol");
        }

        // Menutup objek Scanner
        input.close();
    }
}
