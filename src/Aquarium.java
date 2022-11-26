import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;


public class Aquarium {
    private EasyCanvas ec;
    private int breite;
    private int hoehe;
    private List<IFisch> fische;

    public Aquarium(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.ec = new EasyCanvas(400, 400);
        ec.show();
        this.fische = new ArrayList<>();
    }

    public void addFisch(IFisch fisch) {
        fische.add(fisch);
    }


    public void zeichne() {
        ec.clear();
        for (IFisch fisch : fische) {
            fisch.zeichne(ec);
        }
    }

    public void bewege() {
        for (IFisch fisch : fische) {
            fisch.bewege();
            if (fisch.getPosX() == this.breite) {
                fisch.setPosX(5);
            }
            else if(fisch.getPosX() == 0){
                fisch.setPosX(this.breite);
            }
        }
    }


}
