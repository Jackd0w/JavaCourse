import java.awt.event.ActionListener;

public class Button extends ParentPanel {
    public Button(String text){
        super(text);
        panel.add(button);
    }

    public Button(String text, ActionListener listener ) {
        super(text);
        button.addActionListener(listener);
        panel.add(button);
    }
}
