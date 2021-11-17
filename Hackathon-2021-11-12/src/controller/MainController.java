package controller;

import java.util.ArrayList;
//Import von model
import model.Hardware;
import model.Notebook;
import model.PC;
import model.Workstation;
//Import von view
import view.Output;

public class MainController {
    //Eigentlich fehlen noch Setter + Getter. hier fehlen theoretisch noch die Setter und Getter
    private Output _output;
    //ArrayList von Oberklasse!
    ArrayList<Hardware> _hardware;
    
    public MainController(){
        this._output = new Output();
        setHardware(new ArrayList<Hardware>());
    }
    
    public ArrayList<Hardware> getHardware(){
        return _hardware;
    }
    
    public void setHardware(ArrayList<Hardware> _hardware){
        this._hardware = _hardware;
    }
    
    public void createDemodata(){
        PC pc1 = new PC(1234.21, "asdf", "qsdf", "asdf");
        Notebook n1 = new Notebook(1234.12, "asdf", "asdf", 6.5);
        Workstation w1 = new Workstation(50000.23, "asdf", "asdf", 500);
        getHardware().add(pc1);
        getHardware().add(n1);
        getHardware().add(w1);
    }
    
    public void giveHighestPrice(){
        double maxPreis = 0.0;
        for(Hardware h : getHardware()){
            if(h.getPreis() > maxPreis){
                maxPreis = h.getPreis();
            }
        }
        //Anführungszeichen nötig, weil maxPreis integer und kein String ist! Alleinstehend können nur Strings ausgegeben werden.
        _output.printOutput("" + maxPreis);
    }
}
