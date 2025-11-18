

public class Passageiro {
    private String nome;
    private String voo;
    private int assento;

    // Construtor
    public Passageiro(String nome, String voo, int assento) {
        this.nome = nome;
        this.voo = voo;
        this.assento = assento;
        
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

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }
    
    @Override
    public String toString() {
        return "Passageiro: " + getNome() + ", Voo: " + getVoo() + ", Assento: " + getAssento() ;
    }
}
