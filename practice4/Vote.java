import java.awt.event.ActionEvent;

public abstract class Vote {
    private final ParentPanel labelResult;
    private final ParentPanel labelLastScored;
    private final ParentPanel labelWinner;
    private final IData data;

    public ParentPanel getLabelResult() {
        return labelResult;
    }

    public ParentPanel getLabelLastScored() {
        return labelLastScored;
    }

    public ParentPanel getLabelWinner() {
        return labelWinner;
    }

    public IData getData() {
        return data;
    }

    public Vote(ParentPanel labelResult, ParentPanel labelLastScored, ParentPanel labelWinner, IData data) {
        this.labelResult = labelResult;
        this.labelLastScored = labelLastScored;
        this.labelWinner = labelWinner;
        this.data = data;
    }

    public void actionPerformed(ActionEvent e) {
        String result = String.format("Result %s:%s", data.getMilan(), data.getRM());
        getLabelResult().getLabel().setText(result);
        getLabelWinner().getLabel().setText(data.getWinner());
    }

}
