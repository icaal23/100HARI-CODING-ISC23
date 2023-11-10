import java.util.Arrays;
public class H33_CODING {
    public static void main(String[] args) {
        int angka[] = {1,5,3,4,2};
        
        System.out.println("Sebelum diurutkan : " + Arrays.toString(angka));
        
        Arrays.sort(angka);
        System.out.println("Setelah diurutkan : " + Arrays.toString(angka));
        
    }
}
