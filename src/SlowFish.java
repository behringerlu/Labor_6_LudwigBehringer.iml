import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class SlowFish implements IFisch{
    private double posX;
    private double posY;

    public SlowFish(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public void zeichne(EasyCanvas ec){
        ec.setColor(Color.ORANGE);
        //ec.drawRect(this.getPosX(), this.getPosY(), 10, 10);
        ec.drawOval(this.getPosX(),this.getPosY(),25,12);
        ec.setColor(Color.WHITE);
        ec.fillCircle(this.getPosX()+11,this.getPosY()-4,2);

    }

    @Override
    public void bewege(){
        this.posX+=0.4;
    }

    @Override
    public int getPosX() {
        return (int)posX;
    }
    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return (int)posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
