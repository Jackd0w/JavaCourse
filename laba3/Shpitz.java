public class Shpitz extends Dog{
    @Override
    public void output() {
        String result = String.format("Shpitz. Name: %s, Weight: %s, Has host: %b", getName(), getWeight(), getColour());
        System.out.println(result);
    }

    public Shpitz(String name, int width, String colour) {
        super(name, width, colour);
    }
}
