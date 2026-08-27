import javax.swing.JOptionPane;

public class LT01_SEQ013 {
    public static void main(String[] args){

        double quantidade, QuantDias;

        quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de comida que você têm em KG: "));

        QuantDias = CalculaComida(quantidade);

        JOptionPane.showMessageDialog(null, "Para " + quantidade + "KG de comida, você terá " + QuantDias + " dias para consumir.");

    }

    public static double CalculaComida(double Quant){
        double QuantG = Quant * 1000;
        double dias = QuantG / 50;

        return dias;

    }




}
