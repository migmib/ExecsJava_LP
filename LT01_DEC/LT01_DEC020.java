import javax.swing.*;


public class LT01_SEQ020 {
     public static void main(String[] args) {
         double a, b, c;
         String resultado;

         a = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu coefeciente a: "));
         b = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu coefeciente b: "));
         c = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu coefeciente c: "));


         resultado = Baskara(a, b, c);

         JOptionPane.showMessageDialog(null, resultado);

     }


    public static String Baskara(double A, double B, double C){

        double raiz1 = 0;
        double raiz2 = 0;
        double Del = (Math.pow(B, 2) + (-4 * A * C));

        if (Del > 0 ){

            raiz1 = (-B + Math.sqrt(Del)) / (2 * A);
            raiz2 = (-B - Math.sqrt(Del)) / (2 * A);
            return "Sua primeira raiz vale " + raiz1 + "\nSua segunda raiz vale " + raiz2;

        } else if (Del == 0 ) {
            raiz1 = (-B + Math.sqrt(Del)) / (2 * A);
            raiz2 = (-B - Math.sqrt(Del)) / (2 * A);
            return "Sua primeira raiz vale " + raiz1 + "\nSua segunda raiz não existe " ;
        }

        else {

          return "Sua equação não têm raiz ";

        }



    }
}


