public class Passageiro {
    private String nome;
    private String voo;

    // Construtor
    public Passageiro(String nome, String voo) {
        this.nome = nome;
        this.voo = voo;
    }

    // Getters e Setters com erro (falta de acento ou erro de digitação)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Passageiro: " + nome + ", Voo: " + voo;
    }
}
