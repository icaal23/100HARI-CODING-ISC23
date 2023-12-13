public class H66_CODING {
    public static void main(String[] args) {
        
        int[] nilaiArray = {80, 95, 75, 120, 60};
        int batasNilaiMaksimum = 100;
        
        System.out.println("Nilai dalam array:");

        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.println("Nilai ke-" + (i+1) + ": " + nilaiArray[i]);
            
            if (nilaiArray[i] > batasNilaiMaksimum) {
                System.out.println("Nilai melebihi batas maksimum!");
            } else {
                System.out.println("Nilai dalam batas normal.");
            }
        }
    }
}
