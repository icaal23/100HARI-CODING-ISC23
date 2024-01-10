import java.util.*;
public class H94_CODING {
    public static void main(String[] args) {
        double hargaPerLiter = 6500;
       
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah liter bahan bakar yang diisi: ");
        
        double literBahanBakar = input.nextDouble();
        double totalBiaya = literBahanBakar * hargaPerLiter;
        System.out.println("Total biaya pengisian bahan bakar: Rp " + totalBiaya);

    }
}
