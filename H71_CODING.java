public class H71_CODING {
    public static void main(String[] args) {
        int angka = 5;
        
        if(angkaGenap(angka)){
            System.out.println("angka " + angka + " adalah angka genap");
        }else{
            System.out.println("angka " + angka + " adalah angka ganjil");
        }
    }
    
    public static boolean angkaGenap(int angka){
        return angka % 2 == 0;
    }
          
}
