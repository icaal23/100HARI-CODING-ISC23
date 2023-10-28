public class H20_CODING {
    public static void main(String[] args){
        try{
            String[] siswa = new String[3];
            siswa[0] = "Faisal";
            siswa[1] = "Ical";
            siswa[2] = "Sal";
            
            System.out.println(siswa[3]);
            
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }
        
    }
}
