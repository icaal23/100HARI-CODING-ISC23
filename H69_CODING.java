import java.util.Scanner; 
public class H69_CODING {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pengulangan: ");
        int jumlahPengulangan = scanner.nextInt();
        for (int i = 1; i <= jumlahPengulangan; i++) {
            
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = scanner.nextInt();

            System.out.println("Nilai ke-" + i + ": " + nilai);
        }
        scanner.close();
    }
}
