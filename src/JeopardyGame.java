package src;

import com.sun.jdi.IntegerValue;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.awt.Graphics2D;

import javax.swing.*;


import static javax.swing.UIManager.put;

public class JeopardyGame extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    /*BUTTON IMAGES*/
    //exit button
    private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
    private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));

    //start button
    private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
    private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
    //quit button
    private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
    private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
    //Button Images
    private ImageIcon quiz100BasicImage = new ImageIcon(Main.class.getResource("../images/quiz100Basic.png"));
    private ImageIcon quiz100EnteredImage = new ImageIcon(Main.class.getResource("../images/quiz100Entered.png"));
    private ImageIcon quiz200BasicImage = new ImageIcon(Main.class.getResource("../images/quiz200Basic.png"));
    private ImageIcon quiz200EnteredImage = new ImageIcon(Main.class.getResource("../images/quiz200Entered.png"));
    private ImageIcon quiz300BasicImage = new ImageIcon(Main.class.getResource("../images/quiz300Basic.png"));
    private ImageIcon quiz300EnteredImage = new ImageIcon(Main.class.getResource("../images/quiz300Entered.png"));
    private ImageIcon quiz400BasicImage = new ImageIcon(Main.class.getResource("../images/quiz400Basic.png"));
    private ImageIcon quiz400EnteredImage = new ImageIcon(Main.class.getResource("../images/quiz400Entered.png"));
    private ImageIcon quiz500BasicImage = new ImageIcon(Main.class.getResource("../images/quiz500Basic.png"));
    private ImageIcon quiz500EnteredImage = new ImageIcon(Main.class.getResource("../images/quiz500Entered.png"));

    private ImageIcon answerButtonBasicImage = new ImageIcon(Main.class.getResource("../images/answerButtonBasic.png"));
    private ImageIcon answerButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/answerButtonEntered.png"));

    //category Images
    private Image category1Image = new ImageIcon(Main.class.getResource("../images/category1.png")).getImage();
    private Image category2Image = new ImageIcon(Main.class.getResource("../images/category2.png")).getImage();
    private Image category3Image = new ImageIcon(Main.class.getResource("../images/category3.png")).getImage();
    private Image category4Image = new ImageIcon(Main.class.getResource("../images/category4.png")).getImage();
    private Image category5Image = new ImageIcon(Main.class.getResource("../images/category5.png")).getImage();
    private Image category6Image = new ImageIcon(Main.class.getResource("../images/category6.png")).getImage();

    private Image background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

    private Image turnImage;
    private Image P1BoardImage = new ImageIcon(Main.class.getResource("../images/P1Board.png")).getImage();
    private Image P2BoardImage = new ImageIcon(Main.class.getResource("../images/P2Board.png")).getImage();

    private Image questionBoardImage = new ImageIcon(Main.class.getResource("../images/questionBoard.png")).getImage();

    private JButton exitButton = new JButton(exitButtonBasicImage);
    private JButton startButton = new JButton(startButtonBasicImage);
    private JButton quitButton = new JButton(quitButtonBasicImage);
    // quiz buttons

    private JButton category11Button = new JButton(quiz100BasicImage);
    private JButton category12Button = new JButton(quiz200BasicImage);
    private JButton category13Button = new JButton(quiz300BasicImage);
    private JButton category14Button = new JButton(quiz400BasicImage);
    private JButton category15Button = new JButton(quiz500BasicImage);
    private JButton category21Button = new JButton(quiz100BasicImage);
    private JButton category22Button = new JButton(quiz200BasicImage);
    private JButton category23Button = new JButton(quiz300BasicImage);
    private JButton category24Button = new JButton(quiz400BasicImage);
    private JButton category25Button = new JButton(quiz500BasicImage);
    private JButton category31Button = new JButton(quiz100BasicImage);
    private JButton category32Button = new JButton(quiz200BasicImage);
    private JButton category33Button = new JButton(quiz300BasicImage);
    private JButton category34Button = new JButton(quiz400BasicImage);
    private JButton category35Button = new JButton(quiz500BasicImage);
    private JButton category41Button = new JButton(quiz100BasicImage);
    private JButton category42Button = new JButton(quiz200BasicImage);
    private JButton category43Button = new JButton(quiz300BasicImage);
    private JButton category44Button = new JButton(quiz400BasicImage);
    private JButton category45Button = new JButton(quiz500BasicImage);
    private JButton category51Button = new JButton(quiz100BasicImage);
    private JButton category52Button = new JButton(quiz200BasicImage);
    private JButton category53Button = new JButton(quiz300BasicImage);
    private JButton category54Button = new JButton(quiz400BasicImage);
    private JButton category55Button = new JButton(quiz500BasicImage);
    private JButton category61Button = new JButton(quiz100BasicImage);
    private JButton category62Button = new JButton(quiz200BasicImage);
    private JButton category63Button = new JButton(quiz300BasicImage);
    private JButton category64Button = new JButton(quiz400BasicImage);
    private JButton category65Button = new JButton(quiz500BasicImage);

    private JButton answerButton1 = new JButton("Choice1",answerButtonBasicImage);
    private JButton answerButton2 = new JButton("Choice2",answerButtonBasicImage);
    private JButton answerButton3 = new JButton("Choice3",answerButtonBasicImage);
    private JButton answerButton4 = new JButton("Choice4",answerButtonBasicImage);
    private HashMap<String, JButton> buttons = new HashMap<>(){{
        put("category11Button", category11Button);
        put("category12Button", category12Button);
        put("category13Button", category13Button);
        put("category14Button", category14Button);
        put("category15Button", category15Button);
        put("category21Button", category21Button);
        put("category22Button", category22Button);
        put("category23Button", category23Button);
        put("category24Button", category24Button);
        put("category25Button", category25Button);
        put("category31Button", category31Button);
        put("category32Button", category32Button);
        put("category33Button", category33Button);
        put("category34Button", category34Button);
        put("category35Button", category35Button);
        put("category41Button", category41Button);
        put("category42Button", category42Button);
        put("category43Button", category43Button);
        put("category44Button", category44Button);
        put("category45Button", category45Button);
        put("category51Button", category51Button);
        put("category52Button", category52Button);
        put("category53Button", category53Button);
        put("category54Button", category54Button);
        put("category55Button", category55Button);
        put("category61Button", category61Button);
        put("category62Button", category62Button);
        put("category63Button", category63Button);
        put("category64Button", category64Button);
        put("category65Button", category65Button);
    }};

    private HashMap<String, JButton> answerButtons = new HashMap<>(){{
        put("answerButton1", answerButton1);
        put("answerButton2", answerButton2);
        put("answerButton3", answerButton3);
        put("answerButton4", answerButton4);

    }};


    private int player1score = 0;
    private int player2score = 0;

    private boolean isMainScreen = false;
    private boolean isQuizScreen = false;
    private int turn = 1;
    private boolean turnShown = false;

    private String[][][] questionlist = new String[6][5][6];

    private String currentQuestion;
    private String currentChoice1;
    private String currentChoice2;
    private String currentChoice3;
    private String currentChoice4;
    private String currentAnswer;
    private int currentLevel;




    public JeopardyGame(){

        /*
        * We need to set questions, possible answers, and the answers
        * */
        for(int i = 0; i < 6; i++){
            for(int j = 0; j<5; j++){
                questionlist[i][j][0] = "Question ";
                questionlist[i][j][1] = "choice1";
                questionlist[i][j][2] = "choice2";
                questionlist[i][j][3] = "choice3";
                questionlist[i][j][4] = "choice4";
                questionlist[i][j][5] = "1";
            }
        }

        setUndecorated(true);
        setTitle("Jeopardy Game");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(0,0,0,0));
        setLayout(null);

        //exit button
        exitButton.setBounds(1240,0,30,30);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setIcon(exitButtonEnteredImage);
                exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setIcon(exitButtonBasicImage);
                exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        /*
        * Intro Page buttons
        */
        //start button
        startButton.setBounds(100,400,400,100);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                startButton.setIcon(startButtonEnteredImage);
                startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                startButton.setIcon(startButtonBasicImage);
                startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                startButton.setVisible(false);
                quitButton.setVisible(false);
                quizButtonsVisible();
                background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
                turnImage =  new ImageIcon(Main.class.getResource("../images/Player1.png")).getImage();
                isMainScreen = true;
            }
        });
        add(startButton);

        //quit button
        quitButton.setBounds(100,530,400,100);
        quitButton.setBorderPainted(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setFocusPainted(false);
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                quitButton.setIcon(quitButtonEnteredImage);
                quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                quitButton.setIcon(quitButtonBasicImage);
                quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(quitButton);

        /*
        * Main Page Buttons
        * */
        for (int i=1; i<7; i++){
            for (int j=1; j<6; j++){
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                setButton(buttons.get(result), i, j);
            }
        }

        /*
        * Question Page Buttons
        * */
        for (int i= 1; i <5; i++){
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            setAnswerButtons(answerButtons.get(result), i);
        }


    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics g) {
        g.drawImage(background,  0, 0, null);
        if (!turnShown&&isMainScreen){
            if (turn == 1){
                g.drawImage(turnImage,  215, 10, null);
            }else{
                g.drawImage(turnImage,  215, 10, null);
            }
        }
        if(isMainScreen) {
            g.drawImage(category1Image,  215, 10, null);
            g.drawImage(category2Image,  357, 10, null);
            g.drawImage(category3Image,  499, 10, null);
            g.drawImage(category4Image,  641, 10, null);
            g.drawImage(category5Image,  783, 10, null);
            g.drawImage(category6Image,  925, 10, null);
            g.drawImage(P1BoardImage,  215, 550, null);
            g.drawImage(P2BoardImage,  783, 550, null);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New", Font.BOLD,50));
            g.drawString(String.valueOf(player1score), 256, 645);
            g.drawString(String.valueOf(player2score), 824, 645);
        }else if(isQuizScreen){
            g.drawImage(questionBoardImage,  20, 20, null);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New", Font.BOLD,50));
            g.drawString(currentQuestion, 50, 100);
            showChoice(answerButton1,currentChoice1);
            showChoice(answerButton2,currentChoice2);
            showChoice(answerButton3,currentChoice3);
            showChoice(answerButton4,currentChoice4);
        }
        paintComponents(g);

        this.repaint();


    }

    /*
    * This method is used to show the possible answers for the question
    * on the buttons*/
    public void showChoice(JButton btn, String choice){
        btn.setText(choice);
        btn.setToolTipText("choice1");
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
    }


    public void setButton(JButton btn, int i, int j) {
        int x = 0;
        int y = 0;

        if (i == 1){
            x = 215;
        }else if (i == 2) {
            x = 357;
        }else if (i == 3) {
            x = 499;
        }else if (i == 4) {
            x = 641;
        }else if (i == 5) {
            x = 783;
        }else{
            x = 925;
        }

        if (j == 1){
            y = 114;
        }else if (j == 2) {
            y = 196;
        }else if (j == 3) {
            y = 278;
        }else if (j == 4) {
            y = 360;
        }else {
            y = 442;
        }

        btn.setVisible(false);
        btn.setBounds(x, y, 140, 80);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (j == 1){
                    btn.setIcon(quiz100EnteredImage);
                } else if (j == 2) {
                    btn.setIcon(quiz200EnteredImage);
                } else if (j == 3) {
                    btn.setIcon(quiz300EnteredImage);
                } else if (j == 4) {
                    btn.setIcon(quiz400EnteredImage);
                } else {
                    btn.setIcon(quiz500EnteredImage);
                }
                btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (j == 1){
                    btn.setIcon(quiz100BasicImage);
                } else if (j == 2) {
                    btn.setIcon(quiz200BasicImage);
                } else if (j == 3) {
                    btn.setIcon(quiz300BasicImage);
                } else if (j == 4) {
                    btn.setIcon(quiz400BasicImage);
                } else {
                    btn.setIcon(quiz500BasicImage);
                }
                btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                showQuiz(i-1 , j-1);
            }
        });
        add(btn);

    }

    public void showQuiz (int i, int j){
        enteredQuiz();
        currentQuestion = questionlist[i][j][0];
        currentChoice1 = questionlist[i][j][1];
        currentChoice2 = questionlist[i][j][2];
        currentChoice3 = questionlist[i][j][3];
        currentChoice4 = questionlist[i][j][4];
        currentAnswer = questionlist[i][j][5];
        if (j == 0){
            currentLevel = 100;
        } else if (j == 1) {
            currentLevel = 200;
        } else if (j == 2) {
            currentLevel = 300;
        } else if (j == 3) {
            currentLevel = 400;
        } else {
            currentLevel = 500;
        }

    }

    public void setAnswerButtons(JButton btn, int i){
        int y;
        if (i == 1){
            y = 322;
        }else if(i == 2){
            y = 417;
        }else if(i == 3){
            y = 512;
        }else{
            y = 607;
        }

        btn.setVisible(false);
        btn.setBounds(20, y, 1240, 93);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setIcon(answerButtonEnteredImage);
                btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setIcon(answerButtonBasicImage);
                btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (i == Integer.parseInt(currentAnswer)){
                    if(turn == 1){
                        player1score = player1score + currentLevel;
                        turn = 2;
                    }else{
                        player2score = player2score + currentLevel;
                        turn = 1;
                    }
                }else{
                    if(turn == 1){
                        player1score = player1score - currentLevel;
                        turn = 2;
                    }else{
                        player2score = player2score - currentLevel;
                        turn = 1;
                    }
                }

                if(turn == 1){
                    turnImage =  new ImageIcon(Main.class.getResource("../images/Player1.png")).getImage();
                }else{
                    turnImage =  new ImageIcon(Main.class.getResource("../images/Player2.png")).getImage();
                }

                backMain();


            }
        });
        add(btn);
    }

    public void quizButtonsVisible(){
        for (int i=1; i<7; i++){
            for (int j=1; j<6; j++){
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                buttons.get(result).setVisible(true);
            }
        }
    }

    public void quizButtonsInvisible(){
        for (int i=1; i<7; i++){
            for (int j=1; j<6; j++){
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                buttons.get(result).setVisible(false);
            }
        }
    }

    public void answerButtonsVisible(){
        for (int i= 1; i <5; i++){
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            answerButtons.get(result).setVisible(true);
        }
    }

    public void answerButtonsInvisible(){
        for (int i= 1; i <5; i++){
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            answerButtons.get(result).setVisible(false);
        }
    }



    public void backMain(){
        isMainScreen = true;
        isQuizScreen = false;
        quizButtonsVisible();
        answerButtonsInvisible();
        background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();

    }

    public void enteredQuiz(){
        isMainScreen = false;
        isQuizScreen = true;
        quizButtonsInvisible();
        answerButtonsVisible();
        background = new ImageIcon(Main.class.getResource("../images/quizBackground.jpg")).getImage();
    }
}


