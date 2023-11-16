public class H39_CODING {
    
    // Fungsi dengan tiga parameter bertipe String
    public static String gabungString(String teks1, String teks2, String teks3) {
        String hasilGabungan = teks1 + teks2 + teks3;
        return hasilGabungan;
    }
    
    // Fungsi dengan dua parameter bertipe int
    public static int tambah(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        return hasil;
    }
    
    
    public static void main(String[] args) {
        
        // Memanggil fungsi gabungString
        String hasilGabung = gabungString("Hai ", "nama saya ", "Ical");
        System.out.println("Hasil penggabungan Kata: " + hasilGabung);
        
         // Memanggil fungsi tambah
        int hasilPenjumlahan = tambah(3, 2);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
    }
    
}
