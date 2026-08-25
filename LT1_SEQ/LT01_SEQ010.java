import javax.swing.*;

public class LT01_SEQ010 {
    public static void main(String[] args){

        double n1, n2, diferenca;


    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu N1: "));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu N2: "));

    diferenca = calculaDife (n1, n2);

    JOptionPane.showMessageDialog(null, "A diferença entre " + n1 + " e " + n2 + " = " + diferenca);


    }

    public static double calculaDife (double v1, double v2){

        double calcular = v1 - v2;

        return calcular;






    }




}
