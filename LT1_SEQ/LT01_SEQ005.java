import javax.swing.JOptionPane;
public class LT01_SEQ005 {

    public static void main(String[] args) {

        double a,b,c,r1,r2, delta;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C: "));

        delta = (Math.pow(b,2) - (4 * a * c));
        r1 = (-b + (Math.sqrt(delta))) / (2*a);
        r2 = (-b - (Math.sqrt(delta))) / (2*a);

        JOptionPane.showMessageDialog(null, "O resultado da sau equação é:\n X1 = " + r1 + "\n X2 = " + r2);


    }
}
