import java.util.Scanner;
public class H56_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Usia : ");
        int usia = input.nextInt();
        
        if(usia < 0){
            System.out.println("Tidak Valid");
        }else if(usia < 18){
            System.out.println("Masih anak-anak");
        }else if(usia >= 18){
            System.out.println("Sudah dewasa");
        }
    }
}
