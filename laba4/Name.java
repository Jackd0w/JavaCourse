public class Name implements Nameable {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    Name(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void showinfo(){
        System.out.println("Name:" + getName()+ " age: " + this.age);
    }


}

