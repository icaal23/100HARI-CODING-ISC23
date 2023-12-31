import java.util.*;
public class H83_CODING {
    public static void main(String []args){
        ArrayList<Integer> listAngka = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listAngka.add(i);
        }
        
        listAngka.remove(2);
        System.out.println("Array list setelah menghapus: " + listAngka);

    }
    
}
