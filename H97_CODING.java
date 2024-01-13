import java.util.*;
public class H97_CODING {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Tas");
        list.add("Jam");
        list.add("Buku");

        System.out.println("Sebelum : " + list);
        String firstElement = list.pollFirst();

        System.out.println("Elemen pertama yang dihapus: " + firstElement);
        System.out.println("Sesudah : " + list);
    }
}
