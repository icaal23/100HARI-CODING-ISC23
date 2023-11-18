public class H41_CODING {
    public static String gabungKata(String kata1, String kata2){
        String hasilGabung = kata1 + kata2;
        return hasilGabung;
    }
    
    public static void main(String[] args) {
        String hasilGabung = gabungKata("Selamat ", "Datang");
        System.out.println("Hasil Penggabungan : " + hasilGabung);
    }
}
