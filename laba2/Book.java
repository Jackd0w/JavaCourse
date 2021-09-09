package laba2;

public class Book {
    private String author;
    private String name;
    private int year;
    private int NumberofPages;

    public Book(String a, String n, int y, int num) {
        author = a;
        name = n;
        year = y;
        NumberofPages = num;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String value) {
        this.author = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        this.year = value;
    }

    public int getNumber() {
        return NumberofPages;
    }    

    public void setNumber(int value) {
        this.NumberofPages = value;
    }
}
