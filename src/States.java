
public abstract class States {
    
    private ContexteTraffic contexte;
    
    
    
    public States(ContexteTraffic contexte) {
        super();
        this.contexte = contexte;
    }
    public ContexteTraffic getContexte() {
        return contexte;
    }
    public void setContexte(ContexteTraffic contexte) {
        this.contexte = contexte;
    }
    public abstract void Handle();
    public abstract void changeState();

}
