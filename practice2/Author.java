package practice2;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEamil() {
        return email;
    }

    public void setEamil(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Name is " + this.name + ", email is " + this.email + ", gender is " + this.getGender();
    }

    public void info() {
        System.out.println("Name is " + this.name + ", email is " + this.email + ", gender is " + this.getGender());
    }
}
