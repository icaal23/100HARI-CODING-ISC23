import java.math.BigInteger;
public class H52_CODING {
    public static void main(String[] args) {
        BigInteger angkaPertama = new BigInteger ("12345678910987654321");
        BigInteger angkaKedua = new BigInteger ("109876543212345678910");
        
        BigInteger kurang = angkaPertama.subtract(angkaKedua);
        System.out.println("Hasil Hitung : "+ kurang);
    }
}
