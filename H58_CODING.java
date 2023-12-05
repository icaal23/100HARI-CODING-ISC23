public class H58_CODING {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Dilewati");
                continue;
            }
            System.out.println("Nilai i: " + i);
        }
    }
}
