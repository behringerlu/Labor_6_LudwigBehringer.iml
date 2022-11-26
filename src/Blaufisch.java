import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Blaufisch extends AbstractFish{

    public Blaufisch(int posX, int posY) {
        super(posX, posY);
    }
    @Override
    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.BLUE);
        //ec.drawRect(this.getPosX(), this.getPosY(), 10, 10);
        ec.drawOval(this.getPosX(),this.getPosY(),15,8);
        ec.setColor(Color.WHITE);
        ec.fillCircle(this.getPosX()-5,this.getPosY()-3,2);
    }
    @Override
    public void bewege(){
        setPosX(getPosX()-1);
    }
}
