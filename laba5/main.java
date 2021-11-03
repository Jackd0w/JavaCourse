import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import part1.Rectangle;

import java.awt.*;

public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

}

class DrawFrame extends JFrame {
    public DrawFrame() {
        add(new DrawComponent())
        pack();
    }
}


class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        if (_CurrentFigure == 1) {
            g.DrawRectangle(new Pen(Brushes.Black, 2), 150, 30, 100, 200);
        }
        else if (_CurrentFigure == 2) {
            g.DrawRectangle(new Pen(Brushes.DarkGreen, 2), 150, 30, 200, 100);
        }
        else if (_CurrentFigure == 3) {
            g.DrawEllipse(new Pen(Brushes.DarkGreen, 2), 230, 110, 40, 40);
        }
        else if (_CurrentFigure == 4){
            g.DrawEllipse(new Pen(Brushes.Blue, 2), 230, 110, 40, 40);
        }
        else if (_CurrentFigure == 5) {
            g.drawOval(new Pen(Brushes.Grey, 2), 230, 110, 40, 40);
        }

        var rect = new Rectangle()

    }
}

public class main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> 
        {
            var frame = new DrawFrame();
            frame.setTitle("Figure")
            frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
