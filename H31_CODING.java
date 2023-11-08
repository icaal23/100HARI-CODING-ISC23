public class H31_CODING {
    public static void main(String[] args) {
        String[] urutanKelas = {"Informatika A", "Informatika B", "Informatika C", "Informatika D", "Informatika E"};
        int index = 4;
        
        if(index >= 0 && index < urutanKelas.length){
            String kelas = urutanKelas[index];
            System.out.println("Kelas yang indexnya nomor " + index + " adalah : " + kelas);
        }else{
            System.out.println("Index tidak ada");
        }
        
    }
}
