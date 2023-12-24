import java.util.*;
public class H77_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan suhu : ");
        double suhu = input.nextDouble();
        
        if (suhu > 30){
            System.out.println("Suhu tinggi, silahkan minum air dingin");
        }else if(suhu > 20){
            System.out.println("Suhu sedang, silahkan dinikmati");
        }else{
            System.out.println("Suhu rendah, pastikan menyediakan jaket agar tetap hangat");
        }
    }
}
