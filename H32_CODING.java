public class H32_CODING {
    public static void main(String[] args) {
        String benda[] = {"Benda 1", "Benda 2", "Benda 3"};
        
        System.out.println("Perulangan For");
        for(int i = 0; i < benda.length; i++){
            System.out.println(benda[i]);
        }
        
        System.out.println("================");
        
        System.out.println("Perulangan For Each");
        for(String a : benda){
            System.out.println(a);
        }
    }
}
