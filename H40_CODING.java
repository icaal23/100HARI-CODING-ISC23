public class H40_CODING {
    
    // Fungsi dengan return value dan parameter primitif
    public static int tambahkan(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    
    public static void main(String[] args) {
        
        // Panggil fungsi tambahkan
        int hasilTambah = tambahkan(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilTambah);
    }
}
