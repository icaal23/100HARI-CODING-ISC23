import java.util.*;
public class H61_CODING {
    public static void main(String[] args) {
        Stack<String> menu = new Stack <>();
        
        menu.push("Home");
        menu.push("Profil");
        menu.push("Pengaturan");
        
        String element3 = menu.peek();
        System.out.println("Menampilkan menu ketiga : "+ element3);
        
        System.out.println("Isi menu : "+ menu);
    }
}
