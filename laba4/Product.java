public class Product implements Priceable {
    
    private int age;

    public int getPrice(){
        return age;
    }

    Product(int age){


        this.age = age;
    }

    public void showinfo(){
        System.out.println(" age: " + getPrice());
    }

}
