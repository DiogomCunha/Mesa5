package models;

public class Usuario {

    private String nome;
    private String sobrenome;
    private boolean premium;

    public Usuario(String nome, String sobrenome, boolean premium) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.premium = Boolean.parseBoolean(String.valueOf(premium));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", plano='" + premium + '\'' +
                '}';
    }
}
