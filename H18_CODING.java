import javax.swing.JOptionPane;
public class H18_CODING {
    public static void main(String[] args){
    try{
        JOptionPane.showMessageDialog(null,"program selanjutnya");  
    }catch(ArithmeticException ex){ 
         System.out.println(10/0);
    }
    }
}
