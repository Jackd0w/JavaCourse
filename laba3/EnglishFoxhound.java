public class EnglishFoxhound extends Dog {
    @Override
    public void output() {
        String result = String.format("German Shepherd Dog. Name: %s, Weight: %s, Has host: %b", getName(), getWeight(), getColour());
        System.out.println(result);
    }

    public EnglishFoxhound(String name, int width, String colour) {
        super(name, width, colour);
    }
}
