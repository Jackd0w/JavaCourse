public class main{
    
    public static void main(String[] args) {
        Name obj_1 = new Name("s", 12);
        Name obj_2 = new Name("es", 120);
        obj_1.showinfo();
        obj_2.showinfo();

        Product pro_1 = new Product(12);
        Product pro_2 = new Product(120);
        pro_1.showinfo();
        pro_2.showinfo();
        Priceable one = new Product(10);
        System.out.println(one.getAge());

    }
}