import javax.swing.JOptionPane;

public class LT01_SEQ003 {
    public static void main(String[] args) {
        int b, h, area;

        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do seu triângualo: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do seu triângulo: "));

        area = (b * h) / 2 ;

        JOptionPane.showInternalMessageDialog(null, "O valor da área do triângulo é: " + area + "m²");

    }
}
