import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nomeAeroporto = JOptionPane.showInputDialog("Digite o nome do aeroporto:");
        String capacidadeStr = JOptionPane.showInputDialog("Digite a capacidade de passageiros:");
        int capacidade = Integer.parseInt(capacidadeStr);

        Aeroporto aeroporto = new Aeroporto(nomeAeroporto, capacidade);

        String nomePassageiro = JOptionPane.showInputDialog("Digite o nome do passageiro:");
        String vooPassageiro = JOptionPane.showInputDialog("Digite o voo do passageiro:");
        Passageiro p = new Passageiro(nomePassageiro, vooPassageiro);

        aeroporto.adicionarPassageiro(p, 0);

        JOptionPane.showMessageDialog(null, aeroporto.listarPassageiros());
    }
}
