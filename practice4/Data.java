import javax.imageio.metadata.IIOMetadataFormat;

public class Data implements IData{
    private int voiceMilan = 0;
    private int voiceRM = 0;

    public String getWinner() {
        String winner = "Winner: ";
        if (voiceMilan > voiceRM)
            winner += "AC Milan";
        else if (voiceRM > voiceMilan)
            winner += "Real Madrid";
        else
            winner += "Draw";
        return winner;
    }

    @Override
    public void addMilan() {
        voiceMilan++;
    }

    @Override
    public int getMilan() {
        return voiceMilan;
    }

    @Override
    public void addRM() {
        voiceRM++;
    }

    @Override
    public int getRM() {
        return voiceRM;
    }
}
