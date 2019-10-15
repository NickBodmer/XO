import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class StartNewGameWindow extends JFrame {
    private final GameWindow gameWindow;
    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDHT = 350;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_WIN_LEN = 3;
    private static final int MAX_WIN_LEN = 10;
    private static final String STR_WIN_LEN = "Winning Lenght";
    private static final String STR_FIELD_SIZE = "Field Size";
    private JRadioButton jrbHumanvsAI = new JRadioButton("Human vs AI", true);
    private JRadioButton jrbHumanvsHuman = new JRadioButton("Human vs Human");
    private ButtonGroup gameMode = new ButtonGroup();
    private JSlider slFieldSize;
    private JSlider slWinLenght;

    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setVisible(false);
        setSize(WIN_WIDHT, WIN_HEIGHT);
        setTitle("Game option");
        Rectangle gameWindowsBounds = gameWindow.getBounds();
        int posX = (int) gameWindowsBounds.getCenterX() - WIN_WIDHT / 2;
        int posY = (int) gameWindowsBounds.getCenterX() - WIN_HEIGHT / 2;
        setLocation(posX, posY);
        setLayout(new GridLayout(10, 1));
        addGameControlMode();
        addGameControlFieldWinLenght();
        JButton btnStartGame = new JButton("Start game");
        add(btnStartGame);
        btnStartGame.addActionListener(e -> {
btnStartGameClick();
        });
    }


    private void btnStartGameClick(){
setVisible(false);

    }

    private void addGameControlMode() {
        add(new Label("Choose game mode"));
        gameMode.add(jrbHumanvsAI);
        gameMode.add(jrbHumanvsHuman);
        add(jrbHumanvsAI);
        add(jrbHumanvsHuman);
    }

    private void addGameControlFieldWinLenght() {
        add(new JLabel("Choose field size"));
        JLabel lblFieldSize = new JLabel(STR_FIELD_SIZE + MIN_FIELD_SIZE);
        add(lblFieldSize);
        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        add(slFieldSize);
        slFieldSize.addChangeListener(e -> {
            int currentFieldSize = slFieldSize.getValue();
            slWinLenght.setMaximum(currentFieldSize);
            lblFieldSize.setText(STR_FIELD_SIZE + currentFieldSize);
        });

        add(new JLabel("Choose winning lenght"));
        JLabel lblWinLen = new JLabel(STR_WIN_LEN + MIN_WIN_LEN);
        add(lblWinLen);

        slWinLenght = new JSlider(MIN_WIN_LEN, MAX_WIN_LEN, MIN_WIN_LEN);
        add(slWinLenght);
        slWinLenght.addChangeListener(e -> {
            int currentWinLen = slWinLenght.getValue();
            lblWinLen.setText(STR_WIN_LEN + currentWinLen);
        });

    }
}