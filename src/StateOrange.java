
public class StateOrange extends States {

    public StateOrange(ContexteTraffic contexte) {
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
        Feu.IYELLOW.setText(String.valueOf(Feu.y));
        Feu.y--;
        Feu.IRED.setText(null);
        Feu.IRED.setEnabled(false);
        Feu.IYELLOW.setEnabled(true);
    }

}
