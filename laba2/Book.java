package laba2;

public class Book {

    public Author author;
    public Name name;
    public Year year; 
    public Number number;

    public Book(String author, String name, int year, int number){
        this.author = new Author(author);
        this.name = new Name(name);
        this.year = new Year(year);
        this.number = new Number(number);

    }

    public class Author {
        private String author;

        public Author(String author) {
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String value) {
            this.author = value;
        }

    }

    static class Name {
        private String name;
        public Name(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

    }

    static class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }
        public int getYear() {
            return year;
        }

        public void setYear(int value) {
            this.year = value;
        }
    }

    static class Number {
        private int numberofPages;

        public Number(int numberofPages) {
            this.numberofPages = numberofPages;
        }
        public int getNumber() {
            return numberofPages;
        }    
    
        public void setNumber(int value) {
            this.numberofPages = value;
        }
    }
}
