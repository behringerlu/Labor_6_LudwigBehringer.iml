import de.hsulm.sote2.ecanvas.EasyCanvas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FischMain {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        Aquarium aq = new Aquarium(400, 400);
        aq.addFisch(new Rotfisch(r.nextInt(400),r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400),r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));

        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));

        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));

        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));
        aq.addFisch(new SlowFish(r.nextInt(400), r.nextInt(400)));

        while (true) {
            aq.bewege();
            aq.zeichne();
            Thread.sleep(30);
        }
    }
}



