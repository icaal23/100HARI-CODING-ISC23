import java.util.Scanner;
public class H55_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan pilih barang dari nomor 1-3 : ");
        
        int barang = input.nextInt();
        switch (barang){
            case 1 :
                System.out.println("Laptop");
                break;
            case 2 :
                System.out.println("PC");
                break;
            case 3 :
                System.out.println("Komputer");
                break;
                
            default :
                System.out.println("Barang ini tidak ada");
        }
        
        input.close();
    }
}
