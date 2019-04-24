
public class ContexteTraffic {
    
    private States StateGreen;
    private States StateOrange;
    private States StateRed;
    
    
    public ContexteTraffic(States stateGreen, States stateOrange, States stateRed) {
        super();
        StateGreen = stateGreen;
        StateOrange = stateOrange;
        StateRed = stateRed;
    }
    public ContexteTraffic() {
        super();
        StateGreen = new StateGreen(this);
        StateOrange = new StateOrange(this);
        StateRed = new StateRed(this);
    }
    public States getStateGreen() {
        return StateGreen;
    }
    public void setStateGreen(States stateGreen) {
        StateGreen = stateGreen;
    }
    public States getStateOrange() {
        return StateOrange;
    }
    public void setStateOrange(States stateOrange) {
        StateOrange = stateOrange;
    }
    public States getStateRed() {
        return StateRed;
    }
    public void setStateRed(States stateRed) {
        StateRed = stateRed;
    }
    
    

}
