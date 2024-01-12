import java.util.*;
public class H96_CODING {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Baju");
        list.add("Celana");
        list.add("Sepatu");

        String firstElement = list.poll();
        System.out.println("Elemen yang diambil: " + firstElement);
        System.out.println("Sisa elemen dalam LinkedList: " + list);
    }
}
