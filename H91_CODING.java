import java.util.Deque;
import java.util.LinkedList;
public class H91_CODING {
    public static void main(String[] args) {
        Deque<String> list = new LinkedList<>();
        list.offerFirst("Apel");
        list.offerFirst("Durian");
        list.offerFirst("Rambutan");
        
        System.out.println("List : " + list);
        list.offerFirst("List Baru : ");
        System.out.println("Hasil : " + list);
    }
