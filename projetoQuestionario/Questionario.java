package projetoQuestionario;

import javax.swing.JOptionPane;

/**
 * A classe Questionario é responsável por realizar um questionário interativo usando a classe JOptionPane
 * do pacote Swing do Java. Ela exibe perguntas ao usuário, coleta suas respostas e fornece feedback sobre
 * as respostas corretas ou incorretas.
 * 
 * @author Maria Beatriz Targino
 */
public class Questionario {

    /**
     * Um array de strings que contém as perguntas do questionário.
     */
    private static final String[] PERGUNTAS = {
        "Qual é a capital do Brasil?",
        "Quem descobriu o Brasil?",
        "Quanto é 2 + 2?"
    };

    /**
     * Um array de strings que contém as respostas corretas para as perguntas correspondentes.
     */
    private static final String[] RESPOSTAS = {
        "Brasília",
        "Pedro Álvares Cabral",
        "4"
    };

    /**
     * O método principal que inicia o questionário interativo.
     * @param args.
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        int numPerguntas = PERGUNTAS.length;
        int numAcertos = 0;
        int numErros = 0;

        for (int i = 0; i < numPerguntas; i++) {
            String respostaUsuario = JOptionPane.showInputDialog(null, PERGUNTAS[i]);
            
            if (respostaUsuario != null && respostaUsuario.equalsIgnoreCase(RESPOSTAS[i])) {
                JOptionPane.showMessageDialog(null, "Resposta correta!");
                numAcertos++;
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta! A resposta correta é: " + RESPOSTAS[i]);
                numErros++;
            }
        }

        JOptionPane.showMessageDialog(null, "Fim do questionário, " + nome + "!\nVocê acertou " + numAcertos + " de " + numPerguntas + " perguntas.\nVocê errou " + numErros + " de " + numPerguntas + " perguntas.");
    }
}
