import Main.homework12.Author;
import Main.homework12.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Петр", "Петров");

        Book book1 = new Book("Книга 1", author1, 2020);
        Book book2 = new Book("Книга 2", author2, 2018);

        System.out.println("Книга 1: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());

        book1.setPublicationYear(2021);
        System.out.println("Обновленный год публикации книги 1: " + book1.getPublicationYear());
    }
}