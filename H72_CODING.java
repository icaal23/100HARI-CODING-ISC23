import java.util.Scanner;
public class H72_CODING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        System.out.println("Segitiga siku-siku:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
