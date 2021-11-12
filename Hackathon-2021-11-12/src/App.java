import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        PC pc1 = new PC(1234.21, "asdf", "qsdf", "asdf");
        Notebook n1 = new Notebook(1234.12, "asdf", "asdf", 6.5);
        Workstation w1 = new Workstation(234.23, "asdf", "asdf", 500);
        
        ArrayList<Hardware> hardware = new ArrayList<Hardware>();
        hardware.add(pc1);
        hardware.add(n1);
        hardware.add(w1);
        //Oberklasse Hardware, weil alle Objekte in der entsprechenden ArrayList sind
        Hardware maxPreis = hardware.get(0);
        for (Hardware p : hardware){
            if(p.getPreis() > maxpreis.getPreis())
            System.out.println(maxPreis);
        }
        //For each Schleife sollte implementiert werden, die jedes Element der Array List mit dem obig gesetzten Preis vergleicht --> Sofern dieser Wert per Punktnotation an den Objekten größer ist, so wird die Each-Bedigung der For-Each-Schleife erfüllt und der Wert wird entsprechend initialisiert. Dieser wird dann als höchster Preis ausgegeben.


    }
}
