package model;
//Oberklasse
public class Hardware {
    double _preis;
    String _name;
    String _beschreibung;
    public Hardware(double preis, String name, String beschreibung){
        setBeschreibung(beschreibung);
        setName(name);
        setPreis(preis);
    }
    public void setBeschreibung(String beschreibung) {
        this._beschreibung = beschreibung;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setPreis(double preis) {
        this._preis = preis;
    }
    public String getBeschreibung() {
        return _beschreibung;
    }
    public String getName() {
        return _name;
    }
    public double getPreis() {
        return _preis;
    }
}
