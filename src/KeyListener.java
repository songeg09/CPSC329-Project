package src;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_S){

        }
        else if(e.getKeyCode() == KeyEvent.VK_K){

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {

        } else if (e.getKeyCode() == KeyEvent.VK_K) {


        }
    }
}
