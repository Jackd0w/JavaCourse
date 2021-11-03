import javax.swing.*;



    

public abstract class ParentPanel {
    protected JPanel panel;
    protected JButton button;
    protected JLabel label;

    public JPanel getPanel() {
        return panel;
    }

    public JButton getButton() {
        return button;
    }

    public JLabel getLabel() {
        return label;
    }

    public ParentPanel(String text){
        panel = new JPanel();
        button = new JButton(text);
        label = new JLabel(text);
    }
}