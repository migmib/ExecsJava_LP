import javax.swing.JOptionPane;

public class LT01_SEQ006 {
     public static void main(String[] args) {

         int x, y, z;

         x = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu primeiro valor:"));
         y = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu segundo valor:"));

         JOptionPane.showInternalMessageDialog(null, "Seu primeiro valor é: " + x);
         JOptionPane.showInternalMessageDialog(null, "Seu segundo valor é: " + y );

         z = x;
         x = y;
         y = z;

         JOptionPane.showInternalMessageDialog(null, "Seu primeiro valor trocado é: " + x);
         JOptionPane.showInternalMessageDialog(null, "Seu segundo valor trocado é: " + y );



     }
}
