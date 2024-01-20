package POO.exerciseList1.quest3;

import java.util.Date;

public class testLibrary {
  public static void main(String[] args) {
    BookLibrary bookLibrary = new BookLibrary();

    bookLibrary.title = "Hábitos atômicos";
    bookLibrary.author = "James Clear";
    bookLibrary.genre = "Autoajuda";
    bookLibrary.numberPages = 320;
    bookLibrary.ISBN = "9788550807560";

    bookLibrary.available = false;
    bookLibrary.dueDate = new Date();
    bookLibrary.borrowedFrom = "Moranguinho";

    System.out.println("Detalhes do Livro:");
    System.out.println("Título: " + bookLibrary.title);
    System.out.println("Autor: " + bookLibrary.author);
    System.out.println("Gênero: " + bookLibrary.genre);
    System.out.println("Número de Páginas: " + bookLibrary.numberPages);
    System.out.println("ISBN: " + bookLibrary.ISBN);
    System.out.println("Disponível: " + (bookLibrary.available ? "Sim" : "Não"));
    System.out.println("Data de Devolução: " + bookLibrary.dueDate);
    System.out.println("Emprestado para: " + bookLibrary.borrowedFrom);
  }
}
