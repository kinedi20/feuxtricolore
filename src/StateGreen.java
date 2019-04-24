
public class StateGreen extends States {
    private final int ngreen = 10;

    public StateGreen(ContexteTraffic contexte) {
        super(contexte);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Handle() {
        // TODO Auto-generated method stub
        changeState();
    }

    @Override
    public void changeState() {
        // TODO Auto-generated method stub
        Feu.IGREEN.setText(String.valueOf(Feu.v));
        Feu.v--;
        Feu.IYELLOW.setText(null);
        Feu.IYELLOW.setEnabled(false);
        Feu.IGREEN.setEnabled(true);
    }

}
