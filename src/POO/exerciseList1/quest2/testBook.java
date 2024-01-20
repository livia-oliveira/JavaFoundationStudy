package POO.exerciseList1.quest2;

public class testBook {
  public static void main(String[] args) {
    Book book = new Book();
    book.title = "Como fazer amigos e influenciar pessoas";
    book.language = "Português";
    book.author = "Dale Carnegie";
    book.publisher = "SEXTANTE";
    book.publicationYear = 2019;
    book.typeCover = "mole";
    book.numberPages = 256;

    System.out.println(book.title);
    System.out.println(book.language);
    System.out.println(book.author);
    System.out.println(book.publisher);
    System.out.println(book.publicationYear);
    System.out.println(book.typeCover);
    System.out.println(book.numberPages);
  }
}
