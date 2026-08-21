
import javax.swing.JOptionPane;


    public class LT01_SEQ001 {
        public static void main (String[]args){
             int L, area;

             L = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado de um quadrado imaginário: "));
               area = L * L;

               JOptionPane.showInternalMessageDialog(null,"A área do seu quadrado é: " + area + "m²");


        }
    }
