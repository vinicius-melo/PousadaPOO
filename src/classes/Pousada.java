package classes;

public class Pousada {
    private String nome;
    private String email;
    private boolean vaga;

    public Pousada(String nome, String email) {
        this.nome = nome;
        this.email = email;
        vaga = true;
    }
  
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVaga() {
        return this.vaga;
    }

    public boolean getVaga() {
        return this.vaga;
    }

    public void setVaga(boolean vaga) {
        this.vaga = vaga;
    }

}
