import java.util.ArrayList;
import java.util.List;
public class H90_CODING {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int lastElement = list.get(list.size() - 1);
        System.out.println("Elemen di akhir ArrayList: " + lastElement);
    }
}
