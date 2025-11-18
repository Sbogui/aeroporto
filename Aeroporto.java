// import java.util.ArrayList;
// import java.util.List;
// import javax.swing.JOptionPane;

public class Aeroporto {
    private String nomeAeroporto;
    private int capacidade;

    public Aeroporto(String nomeAeroporto, int capacidade) {
        this.nomeAeroporto = nomeAeroporto;
        this.capacidade = capacidade;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aeroporto{");
        sb.append("nomeAeroporto=").append(nomeAeroporto);
        sb.append(", capacidade=").append(capacidade);
        sb.append('}');
        return sb.toString();
    }
}
