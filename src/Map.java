import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;

    int[] field;
    int mode;
    int fieldSizeX;
    int fieldSizeY;
    int WinLenght;
    boolean isInit = false;


    public Map() {
        setBackground(Color.orange);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int WinLenght) {
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + WinLenght);
        this.mode = mode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.WinLenght = WinLenght;
        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }
        int PanelWidth = getWidth();
        int panelHeight= getHeight();

    }
}

