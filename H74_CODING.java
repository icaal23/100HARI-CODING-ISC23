public class H74_CODING {
    public static void main(String[] args) {
        String sistem = "Berfungsi";
        int bahanBakar = 100;
        String aksesIzin = "Diizinkan";
        String pilot = "Siap";
        
        System.out.println("STATUS ROKET DAN PILOT");
        System.out.println("Sistem Roket : " + sistem);
        System.out.println("Bahan Bakar : " + bahanBakar);
        System.out.println("Sistem Roket : " + aksesIzin);
        System.out.println("Sistem Roket : " + pilot);
        System.out.println();
        
        if (sistem == "Berfungsi" && bahanBakar >= 100 && aksesIzin == "Diizinkan" && pilot == "Iya"){
            System.out.println("Roket Berhasil Meluncur");
        }else{
            System.out.println("Gagal Meluncur");
        }
        
        {
            
        }
        
    }
}
