import javax.swing.JOptionPane;

public class OiNaCidade {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String cidade = JOptionPane.showInputDialog("Digite a cidade em que nasceu");

        System.out.println("Oi " + nome + "!  Que legal saber que você é da cidade " + cidade);
    }
}