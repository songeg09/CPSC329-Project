package src_2;

import src.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class JeopardyGame extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;


    /*Exit Button*/
    private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
    private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
    private JButton exitButton = new JButton(exitButtonBasicImage);

    /*IntroBackground picture*/
    public static Image background;

//-----------------------------------------------------//
//                       Intro                         //
//-----------------------------------------------------//
    /*Start Button*/
    private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
    private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
    private JButton startButton = new JButton(startButtonBasicImage);
    /*Quit Button*/
    private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
    private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
    private JButton quitButton = new JButton(quitButtonBasicImage);

//-----------------------------------------------------//
//                       Main                          //
//-----------------------------------------------------//
    public  Image category1Image = new ImageIcon(Main.class.getResource("../images/category1.png")).getImage();
    private Image category2Image = new ImageIcon(Main.class.getResource("../images/category2.png")).getImage();
    private Image category3Image = new ImageIcon(Main.class.getResource("../images/category3.png")).getImage();
    private Image category4Image = new ImageIcon(Main.class.getResource("../images/category4.png")).getImage();
    private Image category5Image = new ImageIcon(Main.class.getResource("../images/category5.png")).getImage();
    private Image category6Image = new ImageIcon(Main.class.getResource("../images/category6.png")).getImage();

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

    private HashMap<String, JButton> categoryButtons = new HashMap<>(){{
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


    private Image P1BoardImage = new ImageIcon(Main.class.getResource("../images/P1Board.png")).getImage();
    private Image P2BoardImage = new ImageIcon(Main.class.getResource("../images/P2Board.png")).getImage();

    private boolean isMainScreen = false;
    public static int Player1Score = 0;
    public static int Player2Score = 0;


//-----------------------------------------------------//
//                       Quiz                          //
//-----------------------------------------------------//
    private Image questionBoardImage = new ImageIcon(Main.class.getResource("../images/questionBoard.png")).getImage();
    private ImageIcon answerButtonBasicImage = new ImageIcon(Main.class.getResource("../images/answerButtonBasic.png"));
    private ImageIcon answerButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/answerButtonEntered.png"));

    private JButton answerButton1 = new JButton("Choice1",answerButtonBasicImage);
    private JButton answerButton2 = new JButton("Choice2",answerButtonBasicImage);
    private JButton answerButton3 = new JButton("Choice3",answerButtonBasicImage);
    private JButton answerButton4 = new JButton("Choice4",answerButtonBasicImage);

    ArrayList<Quiz> quizList = new ArrayList<Quiz>();

    private HashMap<String, JButton> answerButtons = new HashMap<>(){{
        put("answerButton1", answerButton1);
        put("answerButton2", answerButton2);
        put("answerButton3", answerButton3);
        put("answerButton4", answerButton4);

    }};

    private boolean isQuizScreen = false;

    private int selectedQuiz;
    private int selectedAnswer;

    private int chosenAnswer = 0;

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

        //-----------------------------------------------------//
        //                       Intro                         //
        //-----------------------------------------------------//
        background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

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
                isMainScreen = true;
                background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
                setCategoryButtonsVisible();
            }
        });
        add(startButton);

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

        //-----------------------------------------------------//
        //                       Main                          //
        //-----------------------------------------------------//

        setCategoryButtons();


        //-----------------------------------------------------//
        //                       Quiz                          //
        //-----------------------------------------------------//

        setAnswerButtons();

        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
        quizList.add(new Quiz("What is my name?","Song","Son","Dong","Long",1));
        quizList.add(new Quiz("How old am I?","18","19","23","24",3));
        quizList.add(new Quiz("Where am I from?","Vietnam","Japan","China","South Korea",4));
        quizList.add(new Quiz("What is 1+1?","1","2","3","0",2));
        quizList.add(new Quiz("What is 12*12","121","144","136","98",2));
    }




    //-----------------------------------------------------//
    //                       Methods                       //
    //-----------------------------------------------------//
    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics g){
        g.drawImage(background, 0, 0, null);

        if(isMainScreen){
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
            g.drawString(String.valueOf(Player1Score), 256, 645);
            g.drawString(String.valueOf(Player2Score), 824, 645);
        }else if(isQuizScreen){
            g.drawImage(questionBoardImage,  20, 20, null);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New", Font.BOLD,50));
            g.drawString(quizList.get(selectedQuiz).getQuestion(), 50, 100);
            showChoice(answerButton1,quizList.get(selectedQuiz).getChoice1());
            showChoice(answerButton2,quizList.get(selectedQuiz).getChoice2());
            showChoice(answerButton3,quizList.get(selectedQuiz).getChoice3());
            showChoice(answerButton4,quizList.get(selectedQuiz).getChoice4());
        }

        paintComponents(g);
        this.repaint();
    }

    public void setCategoryButtons() {
        for(int i=1; i<7; i++){
            for(int j=1; j<6;j++){
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;

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

                categoryButtons.get(result).setVisible(false);
                categoryButtons.get(result).setBounds(x, y, 140, 80);
                categoryButtons.get(result).setBorderPainted(false);
                categoryButtons.get(result).setContentAreaFilled(false);
                categoryButtons.get(result).setFocusPainted(false);
                int finalJ = j;
                int finalI = i;
                int finalJ1 = j;
                categoryButtons.get(result).addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        if (finalJ == 1){
                            categoryButtons.get(result).setIcon(quiz100EnteredImage);
                        } else if (finalJ == 2) {
                            categoryButtons.get(result).setIcon(quiz200EnteredImage);
                        } else if (finalJ == 3) {
                            categoryButtons.get(result).setIcon(quiz300EnteredImage);
                        } else if (finalJ == 4) {
                            categoryButtons.get(result).setIcon(quiz400EnteredImage);
                        } else {
                            categoryButtons.get(result).setIcon(quiz500EnteredImage);
                        }
                        categoryButtons.get(result).setCursor(new Cursor(Cursor.HAND_CURSOR));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        if (finalJ == 1){
                            categoryButtons.get(result).setIcon(quiz100BasicImage);
                        } else if (finalJ == 2) {
                            categoryButtons.get(result).setIcon(quiz200BasicImage);
                        } else if (finalJ == 3) {
                            categoryButtons.get(result).setIcon(quiz300BasicImage);
                        } else if (finalJ == 4) {
                            categoryButtons.get(result).setIcon(quiz400BasicImage);
                        } else {
                            categoryButtons.get(result).setIcon(quiz500BasicImage);
                        }
                        categoryButtons.get(result).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        selectedQuiz = (finalI - 1)*5 + (finalJ1 - 1);
                        selectedAnswer = quizList.get(selectedQuiz).getAnswer();
                        isMainScreen = false;
                        isQuizScreen = true;
                        setCategoryButtonsInvisible();
                        setAnswerButtonsVisible();
                        background = new ImageIcon(Main.class.getResource("../images/quizBackground.jpg")).getImage();

                    }
                });
                add(categoryButtons.get(result));
            }
        }


    }
    public void setCategoryButtonsVisible(){
        for(int i=1; i<7; i++) {
            for (int j = 1; j < 6; j++) {
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                categoryButtons.get(result).setVisible(true);
            }
        }
    }

    public void setCategoryButtonsInvisible(){
        for(int i=1; i<7; i++) {
            for (int j = 1; j < 6; j++) {
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                categoryButtons.get(result).setVisible(false);
            }
        }
    }

    public void setAnswerButtons(){
        for (int i= 1; i <5; i++){
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;

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

            answerButtons.get(result).setVisible(false);
            answerButtons.get(result).setBounds(20, y, 1240, 93);
            answerButtons.get(result).setBorderPainted(false);
            answerButtons.get(result).setContentAreaFilled(false);
            answerButtons.get(result).setFocusPainted(false);
            int finalI = i;
            answerButtons.get(result).addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    answerButtons.get(result).setIcon(answerButtonEnteredImage);
                    answerButtons.get(result).setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    answerButtons.get(result).setIcon(answerButtonBasicImage);
                    answerButtons.get(result).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if(finalI == 1){
                        chosenAnswer = 1;
                    } else if (finalI == 2) {
                        chosenAnswer = 2;
                    } else if (finalI == 3) {
                        chosenAnswer = 3;
                    } else {
                        chosenAnswer = 4;
                    }

                    if (chosenAnswer == selectedAnswer){
                        System.out.println("yes");
                    }else{
                        System.out.println("no");
                    }

                    isMainScreen = true;
                    isQuizScreen = false;
                    background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
                    setAnswerButtonsInvisible();
                    setCategoryButtonsVisible();

                }
            });
            add(answerButtons.get(result));
        }
    }

    public void setAnswerButtonsVisible(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            answerButtons.get(result).setVisible(true);
        }
    }

    public void setAnswerButtonsInvisible(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            answerButtons.get(result).setVisible(false);
        }
    }

    public void showChoice(JButton btn, String choice){
        btn.setFont(new Font("Courier New", Font.BOLD,50));
        btn.setText(choice);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
    }

}
