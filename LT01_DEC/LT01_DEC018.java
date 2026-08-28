    import javax.swing.JOptionPane;

    public class LT01_DEC018 {
        static void main(String[] args) {
            int v1, v2, dife;

            v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o V1: "));
            v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o V2: "));

            dife = CalculaDiferenca (v1, v2);

            JOptionPane.showMessageDialog(null,"Diferença = " + dife);




        }

        public static int CalculaDiferenca (int valor1, int valor2){
             int diferenca, maior, menor;

            maior = 0;
            menor = 0;

             if (valor1 > valor2){
                  maior = valor1;
                  menor = valor2;

             }
             else if (valor1 < valor2){
                 maior = valor2;
                 menor = valor1;

             }

             else {

                 JOptionPane.showMessageDialog(null,"Não existe diferença, pois eles são iguais");
             }

             diferenca = (maior - menor);

             return  diferenca;




        }

    }
