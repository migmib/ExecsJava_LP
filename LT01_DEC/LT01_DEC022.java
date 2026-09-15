import javax.swing.*;

public class LT01_DEC022 {

    public static void main(String[] args) {
        int v1, v2;
        String resultado;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu primeiro valor:"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu segundo valor:"));
        
         resultado = OrganizaOrdem2V(v1, v2);

         JOptionPane.showMessageDialog(null, resultado);

    }

    public static String OrganizaOrdem2V( int valor1, int valor2){

        int maior = 0;
        int menor = 0;

        if(valor1 > valor2){

            maior = valor1;
            menor = valor2;
            return  "Ordem crescente: "+ menor + " , " + maior;

        } else if (valor2 > valor1 ) {

            maior = valor2;
            menor = valor1;
            return  "Ordem crescente: "+ menor + " , " + maior;

        }
        else {
           return "Valores iguais!";

        }

    }

}
