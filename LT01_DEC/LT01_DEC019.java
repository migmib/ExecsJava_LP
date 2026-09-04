import javax.swing.*;

public class LT01_DEC019 {
    static void main(String[] args) {
        double a1,a2, M;

        a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

    M = CalculaValor(a1,a2);

    JOptionPane.showMessageDialog(null,"O maior valor é " + M);



    }
    public static double CalculaValor (Double valor1, double valor2){

        double maior = 0 ;
        double menor = 0 ;


        if (valor1  >  valor2){
            maior = valor1;
            menor = valor2;
        }


        else{

           maior = valor2;
           menor = valor1;
        }

        return  maior;










    }



}
