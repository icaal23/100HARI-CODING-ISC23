import java.util.*;
public class H99_CODING {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println("Sebelum : "+ list);
        
        list.push(4);
        list.push(5);
        System.out.println("==================================");
        System.out.println("Hasilnya : "+ list);
    }
}
