public class PC extends Hardware {
    String _anwendungsbereich;
    
    public PC (double preis, String name, String beschreibung, String anwendungsbereich){
        super(preis, name, beschreibung);
        setAnwendungsbereich(anwendungsbereich);
    }
    public void setAnwendungsbereich(String anwendungsbereich) {
        this._anwendungsbereich = anwendungsbereich;
    }
    public String getAnwendungsbereich() {
        return _anwendungsbereich;
    }
}
