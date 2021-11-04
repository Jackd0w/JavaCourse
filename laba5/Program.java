import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Program extends JFrame{
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public Program() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        setTitle("Shapes");
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(350, 350));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        createShapes();
    }

    private void createShapes() {
        for (int i = 0; i < 20; ++i) {
        shapes.add(RandomShape.create());
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
