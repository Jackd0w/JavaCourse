import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;

public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

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
