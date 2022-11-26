import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Rotfisch extends AbstractFish{

    public Rotfisch(int posX, int posY) {
        super(posX, posY);
    }


    @Override
    public void zeichne(EasyCanvas ec){
        ec.setColor(Color.RED);
        ec.drawOval(this.getPosX(),this.getPosY(),10,5);
        ec.setColor(Color.WHITE);
        ec.fillCircle(this.getPosX()+4,this.getPosY()-1,2);
    }
}
