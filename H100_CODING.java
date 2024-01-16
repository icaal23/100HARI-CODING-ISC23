import java.util.*;
public class H100_CODING {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("Pisang");
        list.add("Rambutan");
        list.add("Durian");
        list.add("Coklat");
        System.out.println("Tampilan List : "+ list);
        
        list.remove("Pisang");
        System.out.println("Tampilan List Baru : "+ list);
        
        System.out.println("Jumlah List : "+ list.size());
    }
}
