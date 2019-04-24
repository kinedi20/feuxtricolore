
public class StateRed extends States {
    private final int nred = 10;
    
    public StateRed(ContexteTraffic contexte) {
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
        Feu.IRED.setText(String.valueOf(Feu.r));
        Feu.r--;
    }

}
