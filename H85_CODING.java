import java.util.*;
public class H85_CODING {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("List Awal : " + list);

        removeElement(list, "C");

        System.out.println("Update List : " + list);
    }
    private static void removeElement(ArrayList<String> list, String element) {
        list.remove(element);
        System.out.println("Elemen '" + element + "' dihapus.");
    }
}
