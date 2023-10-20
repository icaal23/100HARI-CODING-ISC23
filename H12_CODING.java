public class H12_CODING {
    public static void main(String[] args) {
        String x = "Bahasa";
        String y = "Java";
        String z = x + "Pemrograman" + y;
        System.out.println(x.equals(z));
        System.out.println(y.equals(z));
        System.out.println((x + "Pemrograman" + y).equals(z));
    }
}
