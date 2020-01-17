package SistemaLivraria;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private boolean aberto;
    private String genero;
    private String autor;
    private String editora;
    private int paginaAtual;
    private int anoPublicado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public Livro(String titulo, int totalPaginas, boolean aberto, String genero, String autor, String editora, int paginaAtual, int anoPublicado) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = aberto;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicado = anoPublicado;
    }


    public  void abrirLivro(){
        this.aberto = true;
    }
    public void fecharLivro(){
        this.aberto = false;
    }

    public boolean
            )


    }










