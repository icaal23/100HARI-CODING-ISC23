public class H46_CODING {
    public static void main(String[] args) {
        int angka [] = {10, 20, 30, 40, 50};
    
        boolean hasil1 = contains(angka, 60);
        boolean hasil2 = contains(angka, 30);
        
        System.out.println("Apakah array mengandung angka 60? " + hasil1);
        System.out.println("Apakah array mengandung angka 30? " + hasil2);
    }
    
     public static boolean contains(int[] array, int nilai) {
        for (int angka : array) {
            if (angka == nilai) {
                return true;
            }
        }
        return false;
    }
}
