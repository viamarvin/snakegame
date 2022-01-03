import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FieldKeyListener extends KeyAdapter {
    private GameField gameField;

    public FieldKeyListener(GameField gameField) {
        this.gameField = gameField;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT && !gameField.right) {
            gameField.left = true;
            gameField.up = false;
            gameField.down = false;
        }

        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT && !gameField.left) {
            gameField.right = true;
            gameField.up = false;
            gameField.down = false;
        }

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP && !gameField.down) {
            gameField.left = false;
            gameField.up = true;
            gameField.right = false;
        }

        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN && !gameField.up) {
            gameField.left = false;
            gameField.down = true;
            gameField.right = false;
        }

        if (key == KeyEvent.VK_P) {
            gameField.timer.stop();
        }

        if (key == KeyEvent.VK_O) {
            gameField.timer.start();
        }
    }
}
