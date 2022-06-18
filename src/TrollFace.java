import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TrollFace {
    static Image t1;
    static Image t2;
    static Image t3;
    static Image t4;
    static Image t5;
    static Image t6;
    static Image center;
    static float trollFaceX1 = 0;
    static float trollFaceY1 = 0;
    static float trollFaceX2 = 0;
    static float trollFaceY2 = 0;
    static float trollFaceX3 = 0;
    static float trollFaceY3 = 0;
    static float trollFaceX4 = 0;
    static float trollFaceY4 = 0;
    static float trollFaceX5 = 0;
    static float trollFaceY5 = 0;
    static float trollFaceX6 = 0;
    static float trollFaceY6 = 0;

    static float trollFaceV1 = 3;
    static float trollFaceV2 = 2;
    static float trollFaceV3 = 1;
    static float trollFaceV4 = 3;
    static float trollFaceV5 = 2;
    static float trollFaceV6 = 1;


    static float trollFaceT1 = 0;
    static float trollFaceT2 = 60;
    static float trollFaceT3 = 120;
    static float trollFaceT4 = 180;
    static float trollFaceT5 = 240;
    static float trollFaceT6 = 300;


    static float trollFaceR1 = 150;
    static float trollFaceR2 = 300;
    static float trollFaceR3 = 450;
    static float trollFaceR4 = 150;
    static float trollFaceR5 = 300;
    static float trollFaceR6 = 450;


    static {
        try {
            t1 = ImageIO.read(Window.class.getResourceAsStream("1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            t2 = ImageIO.read(Window.class.getResourceAsStream("2.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            t3 = ImageIO.read(Window.class.getResourceAsStream("3.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            t4 = ImageIO.read(Window.class.getResourceAsStream("4.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            t5 = ImageIO.read(Window.class.getResourceAsStream("5.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            t6 = ImageIO.read(Window.class.getResourceAsStream("6.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            center = ImageIO.read(Window.class.getResourceAsStream("centr.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
