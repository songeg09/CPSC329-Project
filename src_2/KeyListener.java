package src_2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    JeopardyGame jeo = new JeopardyGame();

    @Override
    public void keyPressed(KeyEvent e){
        if(!JeopardyGame.isQuizScreen){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){
            jeo.pressK();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            jeo.pressS();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        if(!JeopardyGame.isQuizScreen){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){
            jeo.releaseK();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            jeo.releaseS();
        }
    }

}
