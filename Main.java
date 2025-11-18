import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Passageiro> listaPassageiros = new ArrayList<>();
        int opcao = -1;
        String nomeAeroporto = JOptionPane.showInputDialog("Digite o nome do aeroporto:");
        String capacidadeStr = JOptionPane.showInputDialog("Digite a capacidade de passageiros:");
        if (capacidadeStr == null || capacidadeStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Capacidade invalida");
            return;
        }
        try {
            int capacidade = Integer.parseInt(capacidadeStr.trim());
            Aeroporto aeroporto = new Aeroporto(nomeAeroporto, capacidade);
            while(opcao != 0){
            String nomePassageiro = JOptionPane.showInputDialog("Digite o nome do passageiro:");
            String vooPassageiro = JOptionPane.showInputDialog("Digite o voo do passageiro:");
            String assentoPassageiro = JOptionPane.showInputDialog("Digite o assento do passageiro:");
            int assentoIntPassageiro = Integer.parseInt(assentoPassageiro);

            Passageiro p = new Passageiro(nomePassageiro, vooPassageiro,assentoIntPassageiro);
            listaPassageiros.add(p);
            opcao = Integer.parseInt(JOptionPane.showInputDialog("DEseja adicionar outro passageiro? "));

            
            
            }
            
            
            
            JOptionPane.showMessageDialog(null, "Aeroporto: " + aeroporto.getNomeAeroporto() + "\n");
            JOptionPane.showMessageDialog(null, "\n"+listaPassageiros);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}