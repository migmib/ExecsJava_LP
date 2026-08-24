import javax.swing.JOptionPane;

    public class LT01_SEQ008 {
        public static void main(String[] args) {

            double poupanca, depo, rendi;

            poupanca =  Double.parseDouble(JOptionPane.showInputDialog("Quanto você tem na poupança? "));
            depo =  Double.parseDouble(JOptionPane.showInputDialog("Você vai depositar quanto? "));


            rendi = depo * 0.013;
            poupanca = poupanca + rendi + depo;


            JOptionPane.showMessageDialog(null, "O seu saldo atual com aplicação é de R$" + poupanca);


        }

    }
