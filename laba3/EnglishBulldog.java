public class EnglishBulldog extends Dog {

    @Override
    public void output() {
        String result = String.format("English Bulldog. Name: %s, Weight: %s, Has host: %b", getName(), getWeight(), getColour());
        System.out.println(result);
    }

    public EnglishBulldog(String name, int width, String colour) {
        super(name, width, colour);
    }
}
