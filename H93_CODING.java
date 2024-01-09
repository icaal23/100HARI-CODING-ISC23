import java.util.*;
public class H93_CODING {
    public static void main(String[] args){
        Stack<String> list = new Stack<>();
        
        list.push("Kayu");
        list.push("Batu");
        list.push("Debu");
        System.out.println("Isi list : " + list);
        
        list.pop();
        System.out.println("Isi stack setelah menghapus: " + list);
    }
    }
