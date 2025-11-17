import javax.swing.JOptionPane;

public class Aeroporto {
    private String nome;
    // Aqui deveria usar uma lista, por exemplo, mas vamos usar um erro
    private Passageiro[] passageiros;

    public Aeroporto(String nome, int capacidade) {
        this.nome = nome;
        passageiros = new Passageiro[capacidade]; // Pode gerar erro se capacidade < 0
    }

    public void adicionarPassageiro(Passageiro p, int index) {
        if (index >= 0 && index < passageiros.length) {
            passageiros[index] = p; // Pode gerar erro se index inválido
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido");
        }
    }

    public String listarPassageiros() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= passageiros.length; i++) { // erro de lógica: erro de índice (i <= length)
            sb.append(passageiros[i]).append("\n");
        }
        return sb.toString();
    }
}
