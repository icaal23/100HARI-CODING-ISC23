public class H19_CODING {
    public static void main(String[] args){
    try{
        int x = 10;
        int y = 0;
        int z = x/y;
        System.out.println(z);
        System.out.println("Berhasil menghitung");
    }catch(ArithmeticException ex){
        System.out.println("Tidak boleh menggunakan pembagian dengan 0");
    }
    }
}
