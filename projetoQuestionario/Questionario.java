package projetoQuestionario;

import javax.swing.JOptionPane;

/**
 * A classe Questionario � respons�vel por realizar um question�rio interativo usando a classe JOptionPane
 * do pacote Swing do Java. Ela exibe perguntas ao usu�rio, coleta suas respostas e fornece feedback sobre
 * as respostas corretas ou incorretas.
 * 
 * @author Maria Beatriz Targino
 */
public class Questionario {

    /**
     * Um array de strings que cont�m as perguntas do question�rio.
     */
    private static final String[] PERGUNTAS = {
        "Qual � a capital do Brasil?",
        "Quem descobriu o Brasil?",
        "Quanto � 2 + 2?"
    };

    /**
     * Um array de strings que cont�m as respostas corretas para as perguntas correspondentes.
     */
    private static final String[] RESPOSTAS = {
        "Bras�lia",
        "Pedro �lvares Cabral",
        "4"
    };

    /**
     * O m�todo principal que inicia o question�rio interativo.
     * @param args.
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual � o seu nome?");
        int numPerguntas = PERGUNTAS.length;
        int numAcertos = 0;
        int numErros = 0;

        for (int i = 0; i < numPerguntas; i++) {
            String respostaUsuario = JOptionPane.showInputDialog(null, PERGUNTAS[i]);
            
            if (respostaUsuario != null && respostaUsuario.equalsIgnoreCase(RESPOSTAS[i])) {
                JOptionPane.showMessageDialog(null, "Resposta correta!");
                numAcertos++;
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta! A resposta correta �: " + RESPOSTAS[i]);
                numErros++;
            }
        }

        JOptionPane.showMessageDialog(null, "Fim do question�rio, " + nome + "!\nVoc� acertou " + numAcertos + " de " + numPerguntas + " perguntas.\nVoc� errou " + numErros + " de " + numPerguntas + " perguntas.");
    }
}
