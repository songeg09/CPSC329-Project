package src_2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){
        if(!JeopardyGame.isQuizScreen){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){

        }else if(e.getKeyCode() == KeyEvent.VK_S){

        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        if(!JeopardyGame.isQuizScreen){
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_K){

        }else if(e.getKeyCode() == KeyEvent.VK_S){

        }
    }

}
