import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Window extends JFrame {

    static Window window = new Window();
    static long frameTime = System.nanoTime();


    public static void main(String[] args) throws IOException {

        initFrame();
        GameField gameField = new GameField();
        window.add(gameField);
        window.setVisible(true);


    }


    static void initFrame() {
        window.pack();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setBounds(0, 0, 1000, 1000);


    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Window.move(g);
            repaint();


        }
    }

    private static void move(Graphics g) {

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - frameTime) * 0.0000001f;
        frameTime = currentTime;
        g.drawImage(TrollFace.center, 435, 435, null);


        TrollFace.trollFaceT1 = TrollFace.trollFaceT1 + deltaTime * TrollFace.trollFaceV1;
        TrollFace.trollFaceX1 = (float) (TrollFace.trollFaceR1 * Math.cos(Math.toRadians(TrollFace.trollFaceT1)) + 435);
        TrollFace.trollFaceY1 = (float) (TrollFace.trollFaceR1 * Math.sin(Math.toRadians(TrollFace.trollFaceT1)) + 435);

        TrollFace.trollFaceT2 = TrollFace.trollFaceT2 + deltaTime * TrollFace.trollFaceV2;
        TrollFace.trollFaceX2 = (float) (TrollFace.trollFaceR2 * Math.cos(Math.toRadians(TrollFace.trollFaceT2)) + 435);
        TrollFace.trollFaceY2 = (float) (TrollFace.trollFaceR2 * Math.sin(Math.toRadians(TrollFace.trollFaceT2)) + 435);

        TrollFace.trollFaceT3 = TrollFace.trollFaceT3 + deltaTime * TrollFace.trollFaceV3;
        TrollFace.trollFaceX3 = (float) (TrollFace.trollFaceR3 * Math.cos(Math.toRadians(TrollFace.trollFaceT3)) + 435);
        TrollFace.trollFaceY3 = (float) (TrollFace.trollFaceR3 * Math.sin(Math.toRadians(TrollFace.trollFaceT3)) + 435);

        TrollFace.trollFaceT4 = TrollFace.trollFaceT4 + deltaTime * TrollFace.trollFaceV4;
        TrollFace.trollFaceX4 = (float) (TrollFace.trollFaceR4 * Math.cos(Math.toRadians(TrollFace.trollFaceT4)) + 435);
        TrollFace.trollFaceY4 = (float) (TrollFace.trollFaceR4 * Math.sin(Math.toRadians(TrollFace.trollFaceT4)) + 435);

        TrollFace.trollFaceT5 = TrollFace.trollFaceT5 + deltaTime * TrollFace.trollFaceV5;
        TrollFace.trollFaceX5 = (float) (TrollFace.trollFaceR5 * Math.cos(Math.toRadians(TrollFace.trollFaceT5)) + 435);
        TrollFace.trollFaceY5 = (float) (TrollFace.trollFaceR5 * Math.sin(Math.toRadians(TrollFace.trollFaceT5)) + 435);

        TrollFace.trollFaceT6 = TrollFace.trollFaceT6 + deltaTime * TrollFace.trollFaceV6;
        TrollFace.trollFaceX6 = (float) (TrollFace.trollFaceR6 * Math.cos(Math.toRadians(TrollFace.trollFaceT6)) + 435);
        TrollFace.trollFaceY6 = (float) (TrollFace.trollFaceR6 * Math.sin(Math.toRadians(TrollFace.trollFaceT6)) + 435);




        g.drawImage(TrollFace.t1, (int) TrollFace.trollFaceX1, (int) TrollFace.trollFaceY1, null);
        g.drawImage(TrollFace.t2, (int) TrollFace.trollFaceX2, (int) TrollFace.trollFaceY2, null);
        g.drawImage(TrollFace.t3, (int) TrollFace.trollFaceX3, (int) TrollFace.trollFaceY3, null);
        g.drawImage(TrollFace.t4, (int) TrollFace.trollFaceX4, (int) TrollFace.trollFaceY4, null);
        g.drawImage(TrollFace.t5, (int) TrollFace.trollFaceX5, (int) TrollFace.trollFaceY5, null);
        g.drawImage(TrollFace.t6, (int) TrollFace.trollFaceX6, (int) TrollFace.trollFaceY6, null);




    }


}