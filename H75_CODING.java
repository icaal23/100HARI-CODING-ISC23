import java.util.*;
public class H75_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = input.next();
        
        System.out.println("Masukkan Penghasilan : ");
        double penghasilan = input.nextDouble();
        
        double pajak = hitungPajak(penghasilan);
        
        System.out.println("Nama : "+ nama);
        System.out.println("Penghasilan Bulanan : "+ penghasilan);
        System.out.println("Pajak : "+ pajak);
        
        input.close();  
    }
    
    public static double hitungPajak(double penghasilan){
        double persenPajak = 0.10;
        return penghasilan * persenPajak;
    }
}
