import javax.swing.JOptionPane;

public class LT01_SEQ009 {

    public static void main (String[] args){

        int n1, n2, resultado;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N2: "));

        resultado = CalcularSomaQua (n1, n2);

        JOptionPane.showMessageDialog(null, "A soma do quadrado de (" + n1 + " * " + n1 + ") + (" + n2 +" * " + n2 + ") = " + resultado);

    }
     public static int CalcularSomaQua (int x1, int x2){

        int QuadradoS = (x1 *x1 ) + (x2 * x2);

        return QuadradoS;




     }


}
