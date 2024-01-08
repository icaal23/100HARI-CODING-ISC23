import java.util.Stack;
public class H92_CODING {
    public static void main(String []args){
        Stack<String> list = new Stack<>();
        list.push("Komputer");
        list.push("Laptop");
        list.push("Hp");
      
        System.out.println("Sebelum : " + list);
        String poppedElement = list.pop();
        System.out.println("Elemen yang di pop : " + poppedElement);

        System.out.println("Setelah : " + list);
    }
}
