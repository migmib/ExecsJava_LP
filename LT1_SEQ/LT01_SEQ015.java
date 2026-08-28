import javax.swing.*;

public class LT01_SEQ015 {
    public static void main (String[] args){
    double cat1, cat2, hipo;


    cat1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do seu cateto 1  "));
    cat2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite  do cateto 2:  "));

    hipo = Pitagoras(cat1,cat2);

    JOptionPane.showMessageDialog(null,"Hiptenusa = "+ hipo);

    }

    public static double Pitagoras (double c1, double c2){
        double h = (c1*c1) + (c2*c2);
         h = Math.sqrt(h);

        return h ;



    }

}
