import javax.swing.*;

import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class program extends JFrame {
    private Map<Types, ParentPanel> panels = new TreeMap<>();
    private IData data;
    private final JPanel top;
    private final JPanel down;

    public program() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        top = new JPanel(new GridLayout(2, 3));
        down = new JPanel(new BorderLayout());

        add(top, BorderLayout.NORTH);
        add(down, BorderLayout.SOUTH);

        initData();
        initPanels();
        creatingPanels();

        setResizable(false);
        setSize(400, 150);
        setVisible(true);
    }

    private void initData() {
        data = new Data();
    }

    private void initPanels() {
        ParentPanel labelACMilan = new LabelPanel("AC Milan");
        ParentPanel labelWinner = new LabelPanel("Winner: DRAW");
        ParentPanel labelRealMadrid = new LabelPanel("Real Madrid");
        ParentPanel labelResults = new LabelPanel("Result 0x0");
        ParentPanel labelLastScored = new LabelPanel("Last Scored: N/A");

        ParentPanel buttonACMilan = new Button("Scored a goal", new VoteMilan(labelResults, labelLastScored, labelWinner, data));
        ParentPanel buttonRealMadrid = new Button("Scored a goal", new VoteRM(labelResults, labelLastScored, labelWinner, data));

        panels.put(Types.LABEL_AC_MILAN, labelACMilan);
        panels.put(Types.LABEL_WINNER, labelWinner);
        panels.put(Types.LABEL_REAL_MADRID, labelRealMadrid);
        panels.put(Types.BUTTON_AC_MILAN, buttonACMilan);
        panels.put(Types.LABEL_RESULTS, labelResults);
        panels.put(Types.BUTTON_REAL_MADRID, buttonRealMadrid);
        panels.put(Types.LABEL_LAST_SCORED, labelLastScored);
    }

    private void creatingPanels() {
        for (Map.Entry<Types, ParentPanel> item : panels.entrySet()) {
            Types typePanel = item.getKey();
            JPanel panel = item.getValue().getPanel();
            if (typePanel != Types.LABEL_LAST_SCORED) {
                top.add(panel);
            } else {
                down.add(panel, BorderLayout.CENTER);
            }
        }
    }

    public static void main(String[] args) {
        new program();
    }
}
