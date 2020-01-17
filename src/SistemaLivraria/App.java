package SistemaLivraria;

public class App {
    public static void main(String[] args) {
        Autor pessoa =new Autor(
                "Stephen",
                "King",
                "Terror",
                "Masculino",
                "Estados Unidos",
                "Portland",
                72

        );

        Editora empresa = new Editora(
                "Suma",
                1986,
                "50.141.829/0001-82",
                "Praça Floriano,19",
                "Brasil",
                "Rio de Janeiro"


        );

        Livro capitulo1 = new Livro(
                "It- A Coisa",
                1104,
                "",
                "Terror",
                "Stephen King",
                "Suma de Letras",
                0,
                2014



        );
    }
}
