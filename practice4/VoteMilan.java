import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteMilan extends Vote implements ActionListener {
    public VoteMilan(ParentPanel labelResult, ParentPanel labelLastScored, ParentPanel labelWinner, IData data) {
        super(labelResult, labelLastScored, labelWinner, data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getData().addMilan();
        String lastScored = "Last Scored: AC Milan";
        getLabelLastScored().getLabel().setText(lastScored);
        super.actionPerformed(e);
    }
}
