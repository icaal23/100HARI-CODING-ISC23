public class this_pertama {
    int a = 10;
    
    void tampil(){
        int a = 20;
        
        System.out.println("Nilai dari (Local Variabel) 'a'adalah: "+a);
        System.out.println("Nilai dari (Global Variabel) 'a'adalah: "+this.a);
    }
    
}

class MainClass{
    public static void main(String[] args){
    
    this_pertama objek = new this_pertama();
    objek.tampil();
}
}
