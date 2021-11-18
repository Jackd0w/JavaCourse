import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button implements MouseListener {
    private String name;
    private String description;
    private JFrame frame;
    private JButton jButton;

    public Button(String name, String description, JFrame frame) {
        this.name = name;
        this.description = description;
        this.frame = frame;

        jButton = new JButton(this.name);
        jButton.addMouseListener(this);
    }

    public JButton getJButton() {
        return jButton;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(frame, description);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
