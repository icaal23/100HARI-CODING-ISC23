import java.util.LinkedList;
public class H62_CODING {
     public static void main(String[] args) {
        LinkedList<String> kendaraan = new LinkedList<>();

        kendaraan.addLast("Motor");
        kendaraan.addLast("Mobil");
        kendaraan.addLast("Kapal");

        System.out.println("LinkedList setelah menambahkan elemen-elemen:");
        for (String element : kendaraan) {
            System.out.println(element);
        }
    }
}
