import javax.swing.*;
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


    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setVisible(false);

    }

}
