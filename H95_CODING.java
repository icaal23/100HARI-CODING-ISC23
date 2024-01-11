import java.util.*;
public class H95_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai tegangan : ");
        double tegangan = input.nextDouble();

        System.out.print("Masukkan nilai arus : ");
        double arus = input.nextDouble();

        double daya = hitungDaya(tegangan, arus);
        System.out.println("Daya listrik adalah : " + daya + " Watt");
    }

    private static double hitungDaya(double tegangan, double arus) {
        return tegangan * arus;
    }
}
