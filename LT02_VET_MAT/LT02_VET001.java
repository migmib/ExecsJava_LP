import javax.swing.*;

public class LT02_VET001 {
    public static void main(String[] args) {
        int[] vet = new int [49];
        double med;
        int soma = 0 ;
        int quant = 0 ;
        int somaImp = 0;


        for (int i = 0; i < 6; i++){

            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu " + i + "° valor"));
            if (vet[i] >10 & vet[i] < 200){

                soma = soma + vet[i];
                quant = quant + 1;
            }

            if (vet[i] % 2 != 0){

                somaImp = somaImp + vet[i];

            }
        }
            med = (soma / quant);


        JOptionPane.showMessageDialog(null,"Seu média entre os valores é = " + med);
        JOptionPane.showMessageDialog(null,"A soma dos seus valores impares é = " + somaImp);


    }





}
