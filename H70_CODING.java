import java.util.ArrayList;
public class H70_CODING {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        
        namaMahasiswa.add("Vina");
        namaMahasiswa.add("Ical");
        namaMahasiswa.add("Faisal");
        
        System.out.println("DAFTAR NAMA : ");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }
        
        if (namaMahasiswa.contains("Ilham")) {
            System.out.println("Ilham ada di dalam daftar nama.");
        } else {
            System.out.println("Ilham tidak ada di dalam daftar nama.");
        }
    }
}
