import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nome; //declaração das variáveis em STRING
        int idade, opniao, ex = 0, bm = 0, rm = 0; //Declaração das variáveis em inteiro e inicializando ex, bm
        //e rm em 0.


        for (int i = 1; i <= 50; i++) { //laço de repetição for com 10 entradas
            nome = JOptionPane.showInputDialog("Informe o nome do entrevistado: ");
            //mensagem de exibição usando JOptionPane
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do entrevistado: "));
            //convertendo inteiro para String e exibindo uma mensagem usando JOptionPane
            opniao = Integer.parseInt(JOptionPane.showInputDialog(("Informe a opinião do entrevistado: ")));
            //convertendo inteiro para String e exibindo uma mensagem usando JOptionPane

            if (opniao == 1) {//estrutura condicional if (se)
                ex +=1 ; //somando o número de vezes que foi selecionada essa opção e adicionando na variável ex
                JOptionPane.showMessageDialog(null, "O voto foi em EXCELENTE");
                // mostrando ao usuário qual opção ele escolheu
            } else if (opniao == 2) {//estrutura condicional if-else (se-senao)
                bm +=1 ; //somando o número de vezes que foi selecionada essa opção e adicionando na variável bm
                JOptionPane.showMessageDialog(null, "O voto foi em BOM");
                // mostrando ao usuário qual opção ele escolheu
            } else if (opniao == 3) {//estrutura condicional if-else (se-senao)
                rm +=1 ;//somando o número de vezes que foi selecionada essa opção e adicionando na variável rm
                JOptionPane.showMessageDialog(null, "O voto foi em RUIM");
                // mostrando ao usuário qual opção ele escolheu
            } else { //estrutura condicional else (senao)
                JOptionPane.showMessageDialog(null, "INFORME UM NÚMERO DE 1 A 3");
                // informando ao usuário pra escolher uma opção de 1 a 3
            }


        }
        JOptionPane.showMessageDialog(null, "Quantidade de votos EXCELENTE: " + ex);
        //mostrando ao usuário quantas vezes votaram em EXCLENTE, mostrando o que está salvo na variável ex
        JOptionPane.showMessageDialog(null, "Quantidade de votos RUIM: " + rm);
        //mostrando ao usuário quantas vezes votaram em RUIM, mostrando o que está salvo na variável rm

    }

}