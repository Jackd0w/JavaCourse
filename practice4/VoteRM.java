import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteRM extends Vote implements ActionListener {

    public VoteRM(ParentPanel labelResult, ParentPanel labelLastScored, ParentPanel labelWinner, IData data) {
        super(labelResult, labelLastScored, labelWinner, data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getData().addRM();
        String lastScored = "Last Scored: Real Madrid";
        getLabelLastScored().getLabel().setText(lastScored);
        super.actionPerformed(e);
    }
}
