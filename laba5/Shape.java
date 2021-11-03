public abstract class Shape {
    private String colour;
    private int height;
    private int width;

    public abstract void setPosition();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }
}
