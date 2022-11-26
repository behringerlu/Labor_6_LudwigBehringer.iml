import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public abstract class AbstractFish implements IFisch {
    private int posX;
    private int posY;

    public AbstractFish(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void zeichne(EasyCanvas ec);

    public void bewege(){
        this.posX+=1;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }


}
