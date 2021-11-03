public abstract class Dog {
    private String name;
    private int weight;
    private String colour;
    
    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int value) {
        this.weight = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setColour(String value) {
        this.colour = value;
    }

    public String getColour() {
        return colour;
    }

    public abstract void output();

    public Dog(String name, int width, String colour) {
        this.name = name;
        this.weight = width;
        this.colour = colour;
    }
}
