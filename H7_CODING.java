import java.util.Scanner;
public class H7_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gaji_bersih;
        System.out.println("Masukkan Penghasilan : ");
        double penghasilan = input.nextDouble();
        
        if(penghasilan >= 5000000){
            gaji_bersih = penghasilan - (penghasilan * 10/100);
            System.out.println("Pajak 10%");
        }else if(penghasilan >= 3000000){
            gaji_bersih = penghasilan - (penghasilan * 5/100);
            System.out.println("Pajak 5%");
        }else if(penghasilan < 3000000){
            gaji_bersih = penghasilan;
            System.out.println("Pajak 0%");
        }
    }
}
