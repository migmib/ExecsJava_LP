import javax.swing.JOptionPane;



public class LT01_SEQ011 {
    public static void main(String[] args){
        double raio, comprimento;


        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do seu círculo:"));

        comprimento = CalcularCircuferencia(raio);

        JOptionPane.showMessageDialog(null, "O Comprimento do seu círculo é de " + comprimento + "cm");


    }

    public static double CalcularCircuferencia (double r){

        double c = 2 * Math.PI * r;

        return c;

    }

}
