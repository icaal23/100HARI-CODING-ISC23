public class H26_CODING {
    public static void main(String[] args) {
        int nomor1 = 50;
        int nomor2 = 55;
        
        String result1 = (nomor1 % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        String result2 = (nomor2 % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        
        System.out.println(nomor1 + " adalah bilangan " + result1);
        System.out.println(nomor2 + " adalah bilangan " + result2);
    }
}
