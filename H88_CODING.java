public class H88_CODING {
    public static void main(String[] args) {
        String a = "Pemrograman";
        System.out.println("Apakah variabel a kosong? " + isEmptyString(a));
 
        String b = "";
        System.out.println("Apakah variabel b kosong? " + isEmptyString(b));
    }

    public static boolean isEmptyString(String str) {
        return str.isEmpty();
    }
}
