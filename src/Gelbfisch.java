import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Gelbfisch extends AbstractFish {
    public Gelbfisch(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.YELLOW);
        ec.drawOval(this.getPosX(),this.getPosY(),25,12);
        ec.setColor(Color.WHITE);
        ec.fillCircle(this.getPosX()+11,this.getPosY()-4,2);
    }
}
