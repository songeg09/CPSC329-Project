package src;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

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

    //category Images
    private Image category1Image = new ImageIcon(Main.class.getResource("../images/category1.png")).getImage();
    private Image category2Image = new ImageIcon(Main.class.getResource("../images/category2.png")).getImage();
    private Image category3Image = new ImageIcon(Main.class.getResource("../images/category3.png")).getImage();
    private Image category4Image = new ImageIcon(Main.class.getResource("../images/category4.png")).getImage();
    private Image category5Image = new ImageIcon(Main.class.getResource("../images/category5.png")).getImage();
    private Image category6Image = new ImageIcon(Main.class.getResource("../images/category6.png")).getImage();

    private Image background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

    private Image turnImage = new ImageIcon(Main.class.getResource("../images/Player1.png")).getImage();

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

    //private int mouseX, mouseY;

    private boolean isMainScreen = false;
    private int turn = 1;
    private boolean turnShown = false;

    public JeopardyGame(){
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



//        if(isMainScreen){
//            if(turn == 1){
//
//            }
//        }

    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();

        screenDraw(screenGraphic);

        g.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics g) {
        g.drawImage(background,  0, 0, null);
        if(isMainScreen) {
            g.drawImage(category1Image,  215, 10, null);
            g.drawImage(category2Image,  357, 10, null);
            g.drawImage(category3Image,  499, 10, null);
            g.drawImage(category4Image,  641, 10, null);
            g.drawImage(category5Image,  783, 10, null);
            g.drawImage(category6Image,  925, 10, null);
        }
        paintComponents(g);

        this.repaint();
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

                showQuiz(btn);

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

    public void showQuiz (JButton btn){
        isMainScreen = false;
        background = new ImageIcon(Main.class.getResource("../images/quizBackground.jpg")).getImage();
        quizButtonsInvisible();



        if(turn ==1 ){
            turn = 2;
        }else{
            turn = 1;
        }

    }

    public void backMain(){
        isMainScreen = true;
        quizButtonsVisible();
        background = new ImageIcon(Main.class.getResource("../images/mainackground.jpg")).getImage();

    }
}


