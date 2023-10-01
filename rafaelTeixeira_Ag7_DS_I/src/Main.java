import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade, opniao, ex = 0, bm = 0, rm = 0;

        for (int i = 1; i <= 50; i++) {
            nome = JOptionPane.showInputDialog("Informe o nome do entrevistado: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do entrevistado: "));
            opniao = Integer.parseInt(JOptionPane.showInputDialog(("Informe a opinião do entrevistado: ")));

            if (opniao == 1) {
                ex +=1 ;
                JOptionPane.showMessageDialog(null, "O voto foi em EXCELENTE");

            } else if (opniao == 2) {
                bm +=1 ;
                JOptionPane.showMessageDialog(null, "O voto foi em BOM");

            } else if (opniao == 3) {//estrutura condicional if-else (se-senao)
                rm +=1 ;
                JOptionPane.showMessageDialog(null, "O voto foi em RUIM");

            } else {
                JOptionPane.showMessageDialog(null, "INFORME UM NÚMERO DE 1 A 3");
            }

        }
        JOptionPane.showMessageDialog(null, "Quantidade de votos EXCELENTE: " + ex);
        JOptionPane.showMessageDialog(null, "Quantidade de votos RUIM: " + rm);

    }

}