public class H35_CODING {
    
    static void panggil() {
    System.out.println("Halo Ical");
    }

    static void panggilNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        panggil();
        panggilNama("Ical");

        int hasilTambah = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilTambah);
    }
    
}
