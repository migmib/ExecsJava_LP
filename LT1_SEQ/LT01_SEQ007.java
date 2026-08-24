import  javax.swing.JOptionPane;

     public class LT01_SEQ007 {
     public static void main(String[] args) {


        double compri, larg, h, vol ;

        compri =  Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
        larg =  Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
        h =  Double.parseDouble(JOptionPane.showInputDialog("Digite a alturz: "));

        vol = (compri * larg * h);

        JOptionPane.showMessageDialog(null, "O volume do seu paralelepípedo é de: " + vol + "m²");



     }
}


