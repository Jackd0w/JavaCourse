import javax.swing.*;
import java.awt.*;

public class Program extends JFrame {
    public Program() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();

        Button north = new Button("North", "Добро пожаловать на Север", this);
        Button south = new Button("South", "Добро пожаловать Абха", this);

        Button west = new Button("West", "Добро пожаловать в Джидда", this);
        Button east = new Button("East", "Добро пожаловать в Дахране", this);

        Button center = new Button("Center", "Добро пожаловать в Центр", this);

        container.add(north.getJButton(), BorderLayout.NORTH);
        container.add(south.getJButton(), BorderLayout.SOUTH);

        container.add(west.getJButton(), BorderLayout.WEST);
        container.add(east.getJButton(), BorderLayout.EAST);

        container.add(center.getJButton(), BorderLayout.CENTER);

        setSize(500, 500);
    }
}
