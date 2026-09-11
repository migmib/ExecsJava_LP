import javax.swing.*;

public class LT01_DEC021 {
     public static void main (String [] args){
        Double nota1, nota2, nota3, nota4, resultado;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua nota 2: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua nota 3: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua nota 4: "));

        resultado = CalculaNota (nota1, nota2, nota3, nota4);

        JOptionPane.showMessageDialog(null,"Sua foi --->  " + resultado);

     }

        public static double CalculaNota (double n1, double n2, double n3, double n4) {
            double media = (n1 + n2 + n3 + n4) / 4;

            if (media >= 6.0 ) {
                JOptionPane.showMessageDialog(null,"APROVADO" ); 
            }
            else if (media >= 3.0 && media < 6 ) {
                JOptionPane.showMessageDialog(null, "EXAME");
            }
            else {
                JOptionPane.showInternalMessageDialog(null, "REPROVADO");
            }

        return media;

    }
    
}
