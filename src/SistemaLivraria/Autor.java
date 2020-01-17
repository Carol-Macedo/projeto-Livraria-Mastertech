package SistemaLivraria;

public class Autor {
    private String nome;
    private String sobrenome;
    private String generoLiterario;
    private String sexo;
    private String pais;
    private String cidade;
    private int iade;

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

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIade() {
        return iade;
    }

    public void setIade(int iade) {
        this.iade = iade;
    }

    public Autor(String nome, String sobrenome, String generoLiterario, String sexo, String pais, String cidade, int iade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.generoLiterario = generoLiterario;
        this.sexo = sexo;
        this.pais = pais;
        this.cidade = cidade;
        this.iade = iade;
    }

}
