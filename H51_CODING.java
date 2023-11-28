import java.math.BigDecimal;
public class H51_CODING {
    public static void main(String[] args) {
        BigDecimal angka1 = new BigDecimal("123.300");
        BigDecimal angka2 = new BigDecimal("670.300");
        
        BigDecimal tambah = angka1.add(angka2);
        System.out.println("Hasil Penjumlahan : "+ tambah);
    }
}
