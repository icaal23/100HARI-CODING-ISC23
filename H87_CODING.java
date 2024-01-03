import java.util.*;
public class H87_CODING {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apel");
        list.add("Mangga");
        list.add("Durian");
        list.add("Pisang");
        
        System.out.println("Sebelum : "+ list);
        list.removeLast();
        System.out.println("Setelah : "+ list);
    }
}
