import javax.swing.JOptionPane;

    public class LT01_SEQ014 {
        public static void main(String[] args) {

            double angulo1,angulo2, angulo3 ;


        angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do primeiro ângulo do seu triângulo: "));
        angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valo do segundo ângulo do seu triângulo?"));

        angulo3 = CalculaTri(angulo1, angulo2);

        JOptionPane.showMessageDialog(null,"O terceiro ângulo do seu triângulo é igual a " + angulo3 + "º");



    }



    public static double CalculaTri (double a1, double a2) {

        double a3 = 180 - (a1 + a2) ;

        return a3;

    }




}
