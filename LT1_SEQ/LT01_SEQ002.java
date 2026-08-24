import javax.swing.JOptionPane;


    public class LT01_SEQ002 {
        public static void main (String[] args){
             double sal, reajuste;

             sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário: "));
             sal =  sal + (sal * 0.15);

             JOptionPane.showInternalMessageDialog(null, "Seu novo salário é " + sal, "NOVO SALÁRIO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
