public class dataSiswa {
    private String jurusan;
    private String nama;
    private String nim;
    public void setjurusan(String newValue){
        jurusan = newValue;
    }
    public void setnama(String newValue){
        nama = newValue;
    }
    public void setnim(String newValue){
        nim = newValue;
    }
    public String getjurusan(){
        return jurusan;
    }
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }    
}

class main{
    public static void main(String[] args){
        dataSiswa a = new dataSiswa();
        a.setjurusan("Informatika");
        a.setnama("Muhammad Faisal");
        a.setnim("D0223003");
        System.out.println("NIM: "+a.getnim()+"\nNama: "+a.getnama()+"\nJurusan: "+a.getjurusan()); 
    }
}
