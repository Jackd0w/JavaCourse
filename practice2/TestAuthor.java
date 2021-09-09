package practice2;
public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Chuck Palahniuk", "chuckpalanhiuk@gmail.com", 'm');
        Author author2 = new Author("Neal Stephenson", "nealstephenson@gmail.com", 'm');
        author1.info();
        author2.info();

    }
}
