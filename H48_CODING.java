public class H48_CODING {
    public static void main(String[] args) {
        String kalimat = "Halo,programmer";
        String pisahKalimat [] = kalimat.split(",");
        
        System.out.println("Hasil : ");
        for (String a : pisahKalimat){
            System.out.println(a);
        }
    }
}
