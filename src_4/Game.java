package src_4;

import javax.swing.*;
import java.awt.*;

public class Game extends Thread {

    private Image questionBoardImage = new ImageIcon(Main.class.getResource("../images/questionBoard.png")).getImage();
    private Image P1Image = new ImageIcon(Main.class.getResource("../images/P1.png")).getImage();
    private Image P2Image = new ImageIcon(Main.class.getResource("../images/P2.png")).getImage();
    private Image SImage = new ImageIcon(Main.class.getResource("../images/SBasic.png")).getImage();
    private Image KImage = new ImageIcon(Main.class.getResource("../images/KBasic.png")).getImage();

    private Image Player1BuzzImage = new ImageIcon(Main.class.getResource("../images/Player1Buzz.png")).getImage();
    private Image Player2BuzzImage = new ImageIcon(Main.class.getResource("../images/Player2Buzz.png")).getImage();

    public int buzzer = 0;

    public void screenDraw(Graphics g){
        g.drawImage(questionBoardImage,  20, 20, null);
        g.drawImage(P1Image,  20, 350, null);
        g.drawImage(P2Image,  1160, 350, null);
        g.drawImage(SImage,  20, 450, null);
        g.drawImage(KImage,  1160, 450, null);
        if(buzzer == 1){
            g.drawImage(Player1BuzzImage,  140, 100, null);
        } else if (buzzer == 2) {
            g.drawImage(Player2BuzzImage,  140, 100, null);
        }

    }

    public void pressS(){
        if(buzzer == 0){
            SImage = new ImageIcon(Main.class.getResource("../images/SEntered.png")).getImage();
            buzzer = 1;
        }

    }
    public void releaseS(){
        SImage = new ImageIcon(Main.class.getResource("../images/SBasic.png")).getImage();
    }
    public void pressK(){
        if(buzzer == 0){
            KImage = new ImageIcon(Main.class.getResource("../images/KEntered.png")).getImage();
            buzzer = 2;
        }

    }
    public void releaseK(){
        KImage = new ImageIcon(Main.class.getResource("../images/KBasic.png")).getImage();

    }

    @Override
    public void run(){

    }



}
