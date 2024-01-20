package POO.exerciseList1.quest4;

public class testBookStore {
  public static void main(String[] args) {
    BookStore bookStore = new BookStore();

    bookStore.title = "O paradoxo da paixão";
    bookStore.ISBN = "9788550815084";
    bookStore.author = "Brad Stulberg";
    bookStore.numberPages = 192;
    bookStore.price = 39.90;
    bookStore.stockAvailable = true;

    System.out.println("Detalhes do Livro na Livraria:");
    System.out.println("Título: " + bookStore.title);
    System.out.println("ISBN: " + bookStore.ISBN);
    System.out.println("Autor: " + bookStore.author);
    System.out.println("Número de Páginas: " + bookStore.numberPages);
    System.out.println("Preço: R$" + bookStore.price);
    System.out.println("Disponível no Estoque: " + (bookStore.stockAvailable ? "Sim" : "Não"));
  }
}
