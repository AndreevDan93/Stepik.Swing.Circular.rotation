import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Window extends JFrame {
    static Image bomb;
    static Image boom;
    static Window window = new Window();
    static long frameTime = System.nanoTime();
    static float bombX = 0;
    static float bombY = 0;
    static float bombV = 100;
    static int r = 400;
    static int t = 0;
    static boolean left;
    static boolean right;

    public static void main(String[] args) throws IOException {

        initFrame();
        bomb = ImageIO.read(Window.class.getResourceAsStream("icon.png"));
        boom = ImageIO.read(Window.class.getResourceAsStream("boom.jpg"));
        GameField gameField = new GameField();
        window.add(gameField);
        window.setVisible(true);


    }


    static void initFrame() {
        window.pack();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds(0, 0, dimension.width, dimension.height);


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
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - frameTime) * 0.00000001f;
        frameTime = currentTime;

        g.drawImage(boom,dimension.width/2 - bomb.getWidth(null)/2,dimension.height/2 - bomb.getHeight(null)/2,null);

        t = (int) (t + bombV * deltaTime);
        bombX = (float) (r * Math.cos(Math.toRadians(t)) + dimension.width/2 );
        bombY = (float) (r * Math.sin(Math.toRadians(t))+ dimension.height/2 );
        g.drawImage(bomb, (int) bombX, (int) bombY, null);


    }


}