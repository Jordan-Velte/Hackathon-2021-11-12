public class Notebook extends Hardware {
    double _akkulaufzeit;
    
    public Notebook(double preis, String name, String beschreibung, double akkulaufzeit){
        super(preis, name, beschreibung);
        setAkkulaufzeit(akkulaufzeit);
    }
    public double getAkkulaufzeit() {
        return _akkulaufzeit;
    }
    public void setAkkulaufzeit(double akkulaufzeit) {
        this._akkulaufzeit = akkulaufzeit;
    }

}
