
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
       
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        while (true) {
            
            String input = JOptionPane.showInputDialog("Digite um número inteiro:");

           
            if (input == null) {
                break;
            }

            try {
              
                int numero = Integer.parseInt(input);

               
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

              
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                }

            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números inteiros válidos.");
                continue; 
            }

            
            String resposta = JOptionPane.showInputDialog("Deseja encerrar o programa? (Digite 'S' para sim)");

           
            if ("S".equalsIgnoreCase(resposta)) {
                break; 
            }
        }

      
        String mensagemFinal = "Resumo dos números digitados:\n"
                + "Quantidade de Pares: " + pares + "\n"
                + "Quantidade de Ímpares: " + impares + "\n"
                + "Quantidade de Positivos: " + positivos + "\n"
                + "Quantidade de Negativos: " + negativos;

        JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}