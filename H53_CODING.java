import java.util.ArrayList;
public class H53_CODING {
    public static void main(String[] args) {
        ArrayList daftarItem = new ArrayList();
        
        daftarItem.add("Laptop");
        daftarItem.add("PC");
        daftarItem.add("Monitor");

        // Menampilkan isi ArrayList sebelum penambahan
        System.out.println("Item : " + daftarItem);

        // Menambahkan item baru ke dalam ArrayList
        daftarItem.add("WIFI");

        // Menampilkan isi ArrayList setelah penambahan
        System.out.println("Penambahan Item : " + daftarItem);
    }
}
