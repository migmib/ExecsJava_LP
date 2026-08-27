import javax.swing.JOptionPane;

public class LT01_SEQ012 {

    public static void main(String[] args){

        int idade, nasci, AnoAtual, IdadeFutura;

        nasci = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
        AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você está fazendo isso?"));

        idade = CalculaIDD(AnoAtual, nasci);
        IdadeFutura = CalculaIdade17(idade);

        JOptionPane.showMessageDialog(null, "De acordo com os cálculos você têm " + idade + " anos.");
        JOptionPane.showMessageDialog(null, "E daqui 17 anos você terá "+ IdadeFutura + " anos. ");

    }


    public static int CalculaIDD (int ano, int nascimento){

        int idd = ano -  nascimento;

        return idd;

    }


    public static int CalculaIdade17 (int idd){

        int iddF = idd + 17;

        return iddF;

    }






}


