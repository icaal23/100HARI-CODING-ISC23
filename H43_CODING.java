import java.util.ArrayList;
public class H43_CODING {
    public static void main(String[] args) {
        // Mendefinisikan ArrayList integer
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        // Menggunakan metode size untuk mendapatkan panjang ArrayList
        int listSize = numbersList.size();

        // Menampilkan panjang ArrayList
        System.out.println("Panjang ArrayList: " + listSize);
    }
}
