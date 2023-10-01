import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int idade = 0, capacidade = 0, rm = 0, ps = 0, ot = 0, soma = 0;
        String opiniao;
        Double porcentagem = (double) 0;
        Double media = (double) 0;

        while (capacidade < 40) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
            opiniao = JOptionPane.showInputDialog("Informe sua opinião:\n " +
                    " A - Ótimo\n " +
                    " B - Bom\n " +
                    " C - Regular\n " +
                    " D - Ruim\n " +
                    " E - Péssimo\n ").toUpperCase();
            capacidade++;

            switch (opiniao) {
                case "A":
                    JOptionPane.showMessageDialog(null, "Você votou em ÓTIMO");
                    ot++;
                    break;

                case "D":
                    JOptionPane.showMessageDialog(null, "Você votou em RUIM");
                    rm++;
                    soma += idade;
                    media = (double) (soma / rm);
                    break;

                case "E":
                    JOptionPane.showMessageDialog(null, "Você votou em PÉSSIMO");
                    ps++;
                    porcentagem = (double) ( ps * 100 / 40);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Selecione uma das opções disponíveis");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que votaram em ÓTIMO = " + ot);
        JOptionPane.showMessageDialog(null, "Média de idade das pessoas que votaram em RUIM = " + media);
        JOptionPane.showMessageDialog(null, "Porcentagem das pessoas que votaram em PÉSSIMO = " + porcentagem);
    }
}


