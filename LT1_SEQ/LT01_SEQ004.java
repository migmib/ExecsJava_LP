import javax.swing.JOptionPane;

public class LT01_SEQ004 {

    public static void main(String[] args) {

        double celsius, faren;

        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celisus: "));

        faren = ((9*celsius) + 160) / 5;

        JOptionPane.showInternalMessageDialog(null, "A sua temperatura de " + celsius + "°C para fahrenheit é: " + faren + "°F");


    }
}
