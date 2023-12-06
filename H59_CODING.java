public class H59_CODING {
    public static void main(String[] args) {
        int angka = addNo(5,6);
        System.out.println("Hasil : "+ angka);
    }
    
    static int addNo(int a, int b){
        if(a < 0 || b < 0){
            System.out.println("Angka harus Positif");
            return -1;
        }
        return a + b;
    }
}
