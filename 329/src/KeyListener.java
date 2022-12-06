

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){
        if(JeopardyGame.game == null){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){
            JeopardyGame.game.pressK();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            JeopardyGame.game.pressS();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        if(JeopardyGame.game == null){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){
            JeopardyGame.game.releaseK();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            JeopardyGame.game.releaseS();
        }
    }

}
