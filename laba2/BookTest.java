package laba2;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Neal Stephenson", "Cryptonomicon", 1999, 1086);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());



    }
}
