import java.util.*;
public class H98_CODING {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Tas");
        list.add("Jam");
        list.add("Buku");
        System.out.println("Sebelum : " + list);
        
        String lastElement = list.pollLast();
        System.out.println("Elemen terakhir yang dihapus: " + lastElement);
        System.out.println("Sesudah : " + list);
    }
    
}
