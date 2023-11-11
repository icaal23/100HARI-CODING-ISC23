public class H34_CODING {
    public static void main(String[] args) {
        int baris = 3;
        int kolom = 4;
        int array2D[][] = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                array2D[i][a] = i + a;
            }
        }
        
        System.out.println("Isi array 2D : ");
        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                System.out.print(array2D[i][a] + " ");
            }
            System.out.println();
        }

        int rowToAccess = 1;
        int columnToAccess = 2;
        int value = array2D[rowToAccess][columnToAccess];
        System.out.println("Nilai di baris " + rowToAccess + " kolom " + columnToAccess + " : " + value);
    }
}
