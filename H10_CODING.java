public class H10_CODING {
    public static void main(String[] args) {
        String kata = "Teknik Informatika";
        //Format rata kanan, alokasi 50 karakter
        System.out.printf("| %50s | %n", kata);
        //Format rata kiri, alokasi 50 karakter
        System.out.printf("| %-50s | %n", kata);
    }
}
