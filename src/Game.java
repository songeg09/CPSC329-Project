package src;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Game extends Thread {

    private Image questionBoardImage = new ImageIcon(Main.class.getResource("../images/questionBoard.png")).getImage();
    private Image P1Image = new ImageIcon(Main.class.getResource("../images/P1.png")).getImage();
    private Image P2Image = new ImageIcon(Main.class.getResource("../images/P2.png")).getImage();
    private Image SImage = new ImageIcon(Main.class.getResource("../images/SBasic.png")).getImage();
    private Image KImage = new ImageIcon(Main.class.getResource("../images/KBasic.png")).getImage();

    public ImageIcon answerButtonBasicImage = new ImageIcon(src.Main.class.getResource("../images/answerButtonBasic.png"));
    public ImageIcon answerButtonEnteredImage = new ImageIcon(src.Main.class.getResource("../images/answerButtonEntered.png"));

    public JButton answerButton1 = new JButton("Choice1",answerButtonBasicImage);
    public JButton answerButton2 = new JButton("Choice2",answerButtonBasicImage);
    public JButton answerButton3 = new JButton("Choice3",answerButtonBasicImage);
    public JButton answerButton4 = new JButton("Choice4",answerButtonBasicImage);

    public ImageIcon Player1BuzzImage = new ImageIcon(src.Main.class.getResource("../images/Player1Buzz.png"));
    public ImageIcon Player2BuzzImage = new ImageIcon(src.Main.class.getResource("../images/Player2Buzz.png"));
    public JButton Player1BuzzButton = new JButton(Player1BuzzImage);
    public JButton Player2BuzzButton = new JButton(Player2BuzzImage);

    public ImageIcon AnswerCorrectImage = new ImageIcon(src.Main.class.getResource("../images/AnswerCorrect.png"));
    public ImageIcon AnswerWrongImage = new ImageIcon(src.Main.class.getResource("../images/AnswerWrong.png"));
    public JButton AnswerCorrectButton = new JButton(AnswerCorrectImage);
    public JButton AnswerWrongButton = new JButton(AnswerWrongImage);

    public HashMap<String, JButton> answerButtons = new HashMap<>(){{
        put("answerButton1", answerButton1);
        put("answerButton2", answerButton2);
        put("answerButton3", answerButton3);
        put("answerButton4", answerButton4);

    }};


    public int buzzer = -1;

    public void screenDraw(Graphics g){
        g.drawImage(questionBoardImage,  20, 20, null);
        g.drawImage(P1Image,  20, 350, null);
        g.drawImage(P2Image,  1160, 350, null);
        g.drawImage(SImage,  20, 450, null);
        g.drawImage(KImage,  1160, 450, null);
    }

    public void pressS(){
        if(buzzer == -1){
            /*Buzzer unable while isQuizScreen false*/
        }else if(buzzer == 0){
            answerButtonsEnable();
            SImage = new ImageIcon(Main.class.getResource("../images/SEntered.png")).getImage();
            buzzer = 1;
            Player1BuzzButton.setVisible(true);
        }


    }
    public void releaseS(){
        SImage = new ImageIcon(Main.class.getResource("../images/SBasic.png")).getImage();
    }
    public void pressK(){
        if(buzzer == -1){
            /*Buzzer unable while isQuizScreen false*/
        }else if(buzzer == 0){
            answerButtonsEnable();
            KImage = new ImageIcon(Main.class.getResource("../images/KEntered.png")).getImage();
            buzzer = 2;
            Player2BuzzButton.setVisible(true);
        }

    }
    public void releaseK(){
        KImage = new ImageIcon(Main.class.getResource("../images/KBasic.png")).getImage();

    }

    public void answerButtonsEnable(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;

            int y;
            if (i == 1) {
                y = 322;
            } else if (i == 2) {
                y = 417;
            } else if (i == 3) {
                y = 512;
            } else {
                y = 607;
            }


            answerButtons.get(result).setEnabled(true);
        }
    }

    public void answerButtonsUnable(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;

            int y;
            if (i == 1) {
                y = 322;
            } else if (i == 2) {
                y = 417;
            } else if (i == 3) {
                y = 512;
            } else {
                y = 607;
            }


            answerButtons.get(result).setEnabled(false);
        }
    }

    @Override
    public void run(){

    }



}
