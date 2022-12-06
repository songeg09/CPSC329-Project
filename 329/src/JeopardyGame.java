

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class JeopardyGame extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;


    /*Exit Button*/
    private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("exitButtonBasic.png"));
    private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("exitButtonEntered.png"));
    private JButton exitButton = new JButton(exitButtonBasicImage);

    /*IntroBackground picture*/
    public static Image background;

//-----------------------------------------------------//
//                       Intro                         //
//-----------------------------------------------------//
    /*Start Button*/
    private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("startButtonBasic.png"));
    private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("startButtonEntered.png"));
    private JButton startButton = new JButton(startButtonBasicImage);
    /*Quit Button*/
    private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("quitButtonBasic.png"));
    private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("quitButtonEntered.png"));
    private JButton quitButton = new JButton(quitButtonBasicImage);

    private boolean isIntroScreen;

//-----------------------------------------------------//
//                       Main                          //
//-----------------------------------------------------//
    public  Image category1Image = new ImageIcon(Main.class.getResource("category1.png")).getImage();
    private Image category2Image = new ImageIcon(Main.class.getResource("category2.png")).getImage();
    private Image category3Image = new ImageIcon(Main.class.getResource("category3.png")).getImage();
    private Image category4Image = new ImageIcon(Main.class.getResource("category4.png")).getImage();
    private Image category5Image = new ImageIcon(Main.class.getResource("category5.png")).getImage();
    private Image category6Image = new ImageIcon(Main.class.getResource("category6.png")).getImage();

    private ImageIcon quiz100BasicImage = new ImageIcon(Main.class.getResource("quiz100Basic.png"));
    private ImageIcon quiz100EnteredImage = new ImageIcon(Main.class.getResource("quiz100Entered.png"));
    private ImageIcon quiz200BasicImage = new ImageIcon(Main.class.getResource("quiz200Basic.png"));
    private ImageIcon quiz200EnteredImage = new ImageIcon(Main.class.getResource("quiz200Entered.png"));
    private ImageIcon quiz300BasicImage = new ImageIcon(Main.class.getResource("quiz300Basic.png"));
    private ImageIcon quiz300EnteredImage = new ImageIcon(Main.class.getResource("quiz300Entered.png"));
    private ImageIcon quiz400BasicImage = new ImageIcon(Main.class.getResource("quiz400Basic.png"));
    private ImageIcon quiz400EnteredImage = new ImageIcon(Main.class.getResource("quiz400Entered.png"));
    private ImageIcon quiz500BasicImage = new ImageIcon(Main.class.getResource("quiz500Basic.png"));
    private ImageIcon quiz500EnteredImage = new ImageIcon(Main.class.getResource("quiz500Entered.png"));
    private ImageIcon quizUnableImage = new ImageIcon(Main.class.getResource("quizUnable.png"));

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

    private ImageIcon Player1TurnImage = new ImageIcon(Main.class.getResource("Player1Turn.png"));
    private ImageIcon Player2TurnImage = new ImageIcon(Main.class.getResource("Player2Turn.png"));
    private JButton Player1TurnButton = new JButton(Player1TurnImage);
    private JButton Player2TurnButton = new JButton(Player2TurnImage);

    private HashMap<String, JButton> categoryButtons = new HashMap<String, JButton>(){{
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


    private Image P1BoardImage = new ImageIcon(Main.class.getResource("P1Board.png")).getImage();
    private Image P2BoardImage = new ImageIcon(Main.class.getResource("P2Board.png")).getImage();

    private boolean isMainScreen = false;
    private int Player1Score = 0;
    private int Player2Score = 0;
    private int PlayerTurn = 1;
    private int numOfQuizLeft = 30;



//-----------------------------------------------------//
//                       Quiz                          //
//-----------------------------------------------------//

    ArrayList<Quiz> quizList = new ArrayList<Quiz>();

    public static boolean isQuizScreen = false;

    private int selectedQuiz;
    private int selectedQuizX;
    private int selectedQuizY;

    private int selectedAnswer;
    private int selectedPoint;
    private int chosenAnswer = 0;



//-----------------------------------------------------//
//                       Game Finish                   //
//-----------------------------------------------------//

    private ImageIcon Player1WinImage = new ImageIcon(Main.class.getResource("Player1Win.jpg"));
    private ImageIcon Player2WinImage = new ImageIcon(Main.class.getResource("Player2Win.jpg"));
    private ImageIcon DrawImage = new ImageIcon(Main.class.getResource("Draw.jpg"));
    private JButton Player1WinButton = new JButton(Player1WinImage);
    private JButton Player2WinButton = new JButton(Player2WinImage);
    private JButton DrawButton = new JButton(DrawImage);

    public static Game game = new Game();



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
        background = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();

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
                background = new ImageIcon(Main.class.getResource("mainBackground.jpg")).getImage();
                setCategoryButtonsVisible();

                //Player 1 starts first
                Player1TurnButton.setVisible(true);
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

        Player1TurnButton.setVisible(false);
        Player1TurnButton.setBounds(140,100,1000,500);
        Player1TurnButton.setBorderPainted(false);
        Player1TurnButton.setContentAreaFilled(false);
        Player1TurnButton.setFocusPainted(false);
        Player1TurnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Player1TurnButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                Player1TurnButton.setVisible(false);
            }
        });
        add(Player1TurnButton);

        Player2TurnButton.setVisible(false);
        Player2TurnButton.setBounds(140,100,1000,500);
        Player2TurnButton.setBorderPainted(false);
        Player2TurnButton.setContentAreaFilled(false);
        Player2TurnButton.setFocusPainted(false);
        Player2TurnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Player2TurnButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                Player2TurnButton.setVisible(false);
            }
        });
        add(Player2TurnButton);

        setCategoryButtons();


        //-----------------------------------------------------//
        //                       Quiz                          //
        //-----------------------------------------------------//


        /*category 1*/
        quizList.add(new Quiz("Which of the following is the most commonly used and therefore weakest password?","123456","aeiou","Iloveyou","Monkey",1,100,true));
        quizList.add(new Quiz("Which of the following is a user-side vulnerability of passwords?","Key-logging","Shoulder surfing","Phishing","All of the above",4,200,true));
        quizList.add(new Quiz("According to the NIST password guidelines, a user-created password should be at least how many characters?","4","6","8","10",3,300,true));
        quizList.add(new Quiz("What is the name of the property that a hash function has in which for a given h in the output of the hash function, it is hard to find any password x such that H(x)= h?","Collision resistance","Preimage resistance","One-wayness","Fingerprinting",2,400,true));
        quizList.add(new Quiz("How much longer does it take to crack a 12-character password which may contain uppercase letters, lowercase letters, the 10 digits, and 10 symbols, versus a password with just six lowercase letters?","62 times longer","62,000 times longer","62 million times longer","62 trillion times longer",4,500,true));
        /*category 2*/
        quizList.add(new Quiz("What of the following is a type of malware that may cause pop-up advertisements to appear?","Adware","Keylogger","Dropper","Ransomware",1,100,true));
        quizList.add(new Quiz("Which of the following malicious programs evades detection by appearing legitimate?","Worm","Botnet","Ransomware","Trojan horse",4,200,true));
        quizList.add(new Quiz("Which of the following malware spreads by replicating itself and with little-to-no user involvement?","Trojan horse","Worm","Spyware","Rootkit",2,300,true));
        quizList.add(new Quiz("Phishing, baiting, and scareware are examples of _____?","Probes","Insider threats","Social engineering","Ransomware",3,400,true));
        quizList.add(new Quiz("What is the name of the fastest spreading computer worm of all time, which caused an estimated $38 billion in damages?","ILOVEYOU","Mydoom","Melissa","SQL Slammer",2,500,true));
        /*category 3*/
        quizList.add(new Quiz("Biometrics are a measure of…","Physical characteristics","Mental characteristics","Digital characteristics","Behavioral characteristics",1,100,true));
        quizList.add(new Quiz("What is a certificate in relation to message security?","A physical object that shows a users’ ownership of a skill or object","A digital object that shows a users’ ownership of a skill or object","A physical object that verifies a user","A digital object that verifies a user",4,200,true));
        quizList.add(new Quiz("Given the following Unix permission bits of a file, what permissions were given to everyone?  " +
                "-rw-rwx-r-x 1 owner student 0 19 April 13:10 file2","Read only","Read and write","Read, write, and execute","Read and execute",4,300,true));
        quizList.add(new Quiz("Which of the following access control policies includes an implementation where users are only able to read-down and write-up?","Role Based Policy (RBAC)","Mandatory Access Policy (MAC)","Discretionary Policy (DAC)","Diffie-Hellman Protocol (DH)",2,400,true));
        quizList.add(new Quiz("Jeremy Lee, an Australian man, won a historic privacy case against his employer after he was fired for refusing to use a fingerprint scanner. What was the court’s reasoning for ruling in his favor?","He was not given proper consent processes","He was not provided an alternative to using biometrics","The employer did not comply with regulatory requirements","He was both not given proper consent processes and not provided an alternative to using biometrics",4,500,true));
        /*category 4*/
        quizList.add(new Quiz("What does the term “salt” refer to in relation to hashing?","A chemical compound used to season or preserve food","A person acting upset or bitter about past or current events","Random data added as additional input before encryption","Digital information that has been modified",3,100,true));
        quizList.add(new Quiz("Given the key = 1000 1011 1101 and the message = 1111 1010 0011, what is the resulting ciphertext if an exclusive-or operation is applied to the message with the key?","0111 0001 1100","0111 0001 1110","1000 0001 1100","1000 0011 1110",2,200,true));
        quizList.add(new Quiz("Which of the following is NOT a requirement for One-Time Pad (OTP) encryptions to have perfect secrecy against an eavesdropper?","The contents of the pad must be truly random","No part of the pad can be used more than once","The resulting ciphertext of the pad must not be leaked","The pad must be the same size or larger than the message being encrypted",3,300,true));
        quizList.add(new Quiz("In a block cipher, how many possible keys are there when the block size is 3?","8","2048","40,320","Over 1 million",3,400,true));
        quizList.add(new Quiz("In blockchain encryption data is grouped together as blocks and stored. How easily modifiable is data stored in a blockchain system?","Unable to be modified","Difficult to modify","Easy to modify","Dependent on which block of the blockchain you are on",1,500,true));
        /*category 5*/
        quizList.add(new Quiz("What is the number 27 in decimal form?","11011","27","1b","33",2,100,true));
        quizList.add(new Quiz("If the binary string 1100 represents the number 12, which bit is the most significant bit (msb)?","The leftmost bit","The second bit from the left","The second bit from the right","The rightmost bit",1,200,true));
        quizList.add(new Quiz("What is the largest number (in decimal form) that can be represented by 2 hex digits in hexadecimal form?","64","128","255","256",3,300,true));
        quizList.add(new Quiz("How many bits are needed to represent an ASCII character? (ignoring the one parity bit)","3","7","15","31",2,400,true));
        quizList.add(new Quiz("What is the signed binary number 1101 in decimal form?","13","-13","5","-5",4,500,true));
        /*category 6*/
        quizList.add(new Quiz("How should passwords be stored in a network system?","Stored in a digital file in plaintext","Stored in a digital file in encrypted form","Stored in a physical file inside of a vault","Not stored in the network at all",2,100,true));
        quizList.add(new Quiz("What does a man-in-the-middle attack refer to?","Communication between two parties is relayed through a third-party unintentionally","An individual or network is attacked by multiple parties simultaneously","An insider attacks an organization from within","When an attack is conducted through an unaware and innocent individual",1,200,true));
        quizList.add(new Quiz("What is not a method of improving the security of a password system?","Slowing down a password system","Multi-factor authentication","Including complexity rules for password (numbers, special characters, etc)","Not forcing users to change passwords periodically",3,300,true));
        quizList.add(new Quiz("What is a distributed denial-of-service attack?","Targeting numerous networks and blocking user access to them","Targeting groups of users and blocking them from accessing their network","Disrupting a network by overwhelming it with fake traffic to block user access","Disrupting a network through physical destruction of the hardware its run on",3,400,true));
        quizList.add(new Quiz("What year were cybercrime laws first introduced to the world?","1965","1986","2001","2012",2,500,true));

        game.Player1BuzzButton.setVisible(false);
        game.Player1BuzzButton.setBounds(0,0,1280,720);
        game.Player1BuzzButton.setBorderPainted(false);
        game.Player1BuzzButton.setContentAreaFilled(false);
        game.Player1BuzzButton.setFocusPainted(false);
        game.Player1BuzzButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.Player1BuzzButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                game.Player1BuzzButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {

                game.Player1BuzzButton.setVisible(false);
            }
        });
        add(game.Player1BuzzButton);

        game.Player2BuzzButton.setVisible(false);
        game.Player2BuzzButton.setBounds(0,0,1280,720);
        game.Player2BuzzButton.setBorderPainted(false);
        game.Player2BuzzButton.setContentAreaFilled(false);
        game.Player2BuzzButton.setFocusPainted(false);
        game.Player2BuzzButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.Player2BuzzButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                game.Player2BuzzButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {

                game.Player2BuzzButton.setVisible(false);
            }
        });
        add(game.Player2BuzzButton);

        game.DoublePointsButton.setVisible(false);
        game.DoublePointsButton.setBounds(0,0,1280,720);
        game.DoublePointsButton.setBorderPainted(false);
        game.DoublePointsButton.setContentAreaFilled(false);
        game.DoublePointsButton.setFocusPainted(false);
        game.DoublePointsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.DoublePointsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                game.DoublePointsButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {

                game.DoublePointsButton.setVisible(false);
            }
        });
        add(game.DoublePointsButton);

        game.AnswerCorrectButton.setVisible(false);
        game.AnswerCorrectButton.setBounds(0,0,1280,720);
        game.AnswerCorrectButton.setBorderPainted(false);
        game.AnswerCorrectButton.setContentAreaFilled(false);
        game.AnswerCorrectButton.setFocusPainted(false);
        game.AnswerCorrectButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.AnswerCorrectButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                game.AnswerCorrectButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                game.AnswerCorrectButton.setVisible(false);
                if(PlayerTurn == 1){
                    PlayerTurn = 2;
                    Player2TurnButton.setVisible(true);
                }else{
                    PlayerTurn = 1;
                    Player1TurnButton.setVisible(true);
                }
                isMainScreen = true;
                isQuizScreen = false;
                background = new ImageIcon(Main.class.getResource("mainBackground.jpg")).getImage();
                setAnswerButtonsInvisible();
                setCategoryButtonsVisible();
                game.answerButtonsUnable();
            }
        });
        add(game.AnswerCorrectButton);

        game.AnswerWrongButton.setVisible(false);
        game.AnswerWrongButton.setBounds(0,0,1280,720);
        game.AnswerWrongButton.setBorderPainted(false);
        game.AnswerWrongButton.setContentAreaFilled(false);
        game.AnswerWrongButton.setFocusPainted(false);
        game.AnswerWrongButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.AnswerWrongButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                game.AnswerWrongButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                game.AnswerWrongButton.setVisible(false);
                if(PlayerTurn == 1){
                    PlayerTurn = 2;
                    Player2TurnButton.setVisible(true);
                }else{
                    PlayerTurn = 1;
                    Player1TurnButton.setVisible(true);
                }
                isMainScreen = true;
                isQuizScreen = false;
                background = new ImageIcon(Main.class.getResource("mainBackground.jpg")).getImage();
                setAnswerButtonsInvisible();
                setCategoryButtonsVisible();
                game.answerButtonsUnable();
            }
        });
        add(game.AnswerWrongButton);

        setAnswerButtons();


        addKeyListener(new KeyListener());

        //-----------------------------------------------------//
        //                       Game Finish                   //
        //-----------------------------------------------------//

        Player1WinButton.setVisible(false);
        Player1WinButton.setBounds(0,0,1280,720);
        Player1WinButton.setBorderPainted(false);
        Player1WinButton.setContentAreaFilled(false);
        Player1WinButton.setFocusPainted(false);
        Player1WinButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Player1WinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                Player1WinButton.setVisible(false);
                numOfQuizLeft = 30;
                setCategoryButtonsEnable();
                startButton.setVisible(true);
                quitButton.setVisible(true);
                background = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();
                Player1Score = 0;
                Player2Score = 0;
            }
        });
        add(Player1WinButton);

        Player2WinButton.setVisible(false);
        Player2WinButton.setBounds(0,0,1280,720);
        Player2WinButton.setBorderPainted(false);
        Player2WinButton.setContentAreaFilled(false);
        Player2WinButton.setFocusPainted(false);
        Player2WinButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Player2WinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                Player2WinButton.setVisible(false);
                numOfQuizLeft = 30;
                setCategoryButtonsEnable();
                startButton.setVisible(true);
                quitButton.setVisible(true);
                background = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();
                Player1Score = 0;
                Player2Score = 0;
            }
        });
        add(Player2WinButton);


        DrawButton.setVisible(false);
        DrawButton.setBounds(0,0,1280,720);
        DrawButton.setBorderPainted(false);
        DrawButton.setContentAreaFilled(false);
        DrawButton.setFocusPainted(false);
        DrawButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                DrawButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                DrawButton.setVisible(false);
                numOfQuizLeft = 30;
                setCategoryButtonsEnable();
                startButton.setVisible(true);
                quitButton.setVisible(true);
                background = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();
                Player1Score = 0;
                Player2Score = 0;
            }
        });
        add(DrawButton);

    }




    //-----------------------------------------------------//
    //                       Methods                       //
    //-----------------------------------------------------//
    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw((Graphics2D) screenGraphic);

        g.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics2D g)  {
        g.drawImage(background, 0, 0, null);

        if(numOfQuizLeft == 0){
            allButtonsInvisible();
            isMainScreen = false;
            isQuizScreen = false;
            for(int i = 0; i <quizList.size(); i++){
                quizList.get(i).setAble(true);
            }
            if(Player1Score > Player2Score){
                Player1WinButton.setVisible(true);
            } else if (Player1Score < Player2Score) {
                Player2WinButton.setVisible(true);
            } else{
                DrawButton.setVisible(true);
            }
        }
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
            paintComponents(g);
        }else if(isQuizScreen){
            showChoice(game.answerButton1,quizList.get(selectedQuiz).getChoice1());
            showChoice(game.answerButton2,quizList.get(selectedQuiz).getChoice2());
            showChoice(game.answerButton3,quizList.get(selectedQuiz).getChoice3());
            showChoice(game.answerButton4,quizList.get(selectedQuiz).getChoice4());
            game.screenDraw(g);
            paintComponents(g);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New", Font.BOLD,40));
            drawStringMultiLine(g, quizList.get(selectedQuiz).getQuestion(), 1150, 50, 100);
        }else{
            paintComponents(g);
        }


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
                        selectedQuizX = finalI;
                        selectedQuizY = finalJ;
                        selectedAnswer = quizList.get(selectedQuiz).getAnswer();
                        selectedPoint = quizList.get(selectedQuiz).getPoint();
                        if(quizList.get(selectedQuiz).isAble()){
                            isMainScreen = false;
                            isQuizScreen = true;
                            doublePoints();
                            /*buzzer enable*/
                            game.buzzer++;
                            setCategoryButtonsInvisible();
                            setAnswerButtonsVisible();
                            setFocusable(true);
                            background = new ImageIcon(Main.class.getResource("quizBackground.jpg")).getImage();
                        }


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
                if(quizList.get((i - 1)*5 + (j - 1)).isAble()){
                    categoryButtons.get(result).setVisible(true);
                }
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

    public void setCategoryButtonsEnable(){
        for(int i=1; i<7; i++) {
            for (int j = 1; j < 6; j++) {
                String category = "category";
                String first = String.valueOf(i);
                String second = String.valueOf(j);
                String button = "Button";
                String result = category + first + second + button;
                categoryButtons.get(result).setEnabled(true);
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


            game.answerButtons.get(result).setEnabled(false);
            game.answerButtons.get(result).setVisible(false);
            game.answerButtons.get(result).setBounds(120, y, 1040, 93);
            game.answerButtons.get(result).setBorderPainted(false);
            game.answerButtons.get(result).setContentAreaFilled(false);
            game.answerButtons.get(result).setFocusPainted(false);
            int finalI = i;
            game.answerButtons.get(result).addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    game.answerButtons.get(result).setIcon(game.answerButtonEnteredImage);
                    game.answerButtons.get(result).setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    game.answerButtons.get(result).setIcon(game.answerButtonBasicImage);
                    game.answerButtons.get(result).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if(game.buzzer != 0){
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
                            if(game.buzzer == 1){
                                Player1Score = Player1Score + selectedPoint;
                            }else if (game.buzzer == 2){
                                Player2Score = Player2Score + selectedPoint;
                            }else{

                            }

                            quizList.get(selectedQuiz).setAble(false);
                            numOfQuizLeft = numOfQuizLeft - 1;

                            game.AnswerCorrectButton.setVisible(true);

                        }else{
                            if(game.buzzer == 1){
                                Player1Score = Player1Score - selectedPoint;
                            }else if (game.buzzer == 2){
                                Player2Score = Player2Score - selectedPoint;
                            }
                            game.AnswerWrongButton.setVisible(true);
                        }

                        game.buzzer = -1;


                    }


                }
            });
            add(game.answerButtons.get(result));
        }
    }

    public void setAnswerButtonsVisible(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            game.answerButtons.get(result).setVisible(true);
        }
    }

    public void setAnswerButtonsInvisible(){
        for (int i= 1; i <5; i++) {
            String answer = "answer";
            String Button = "Button";
            String index = String.valueOf(i);
            String result = answer + Button + index;
            game.answerButtons.get(result).setVisible(false);
        }
    }

    public void showChoice(JButton btn, String choice){
        int length = choice.length();

        if (length > 95) {
            btn.setFont(new Font("Courier New", Font.BOLD,17));
        } else if (length > 55) {
            btn.setFont(new Font("Courier New", Font.BOLD,20));
        } else if (length > 35) {
            btn.setFont(new Font("Courier New", Font.BOLD,30));
        }
        else {
            btn.setFont(new Font("Courier New", Font.BOLD,40));
        }
        btn.setText(choice);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
    }

    public void allButtonsInvisible(){
        setCategoryButtonsInvisible();
        setAnswerButtonsInvisible();
        Player1TurnButton.setVisible(false);
        Player2TurnButton.setVisible(false);
    }

    public static void drawStringMultiLine(Graphics2D g, String text, int lineWidth, int x, int y) {
        FontMetrics m = g.getFontMetrics();
        if(m.stringWidth(text) < lineWidth) {
            g.drawString(text, x, y);
        } else {
            String[] words = text.split(" ");
            String currentLine = words[0];
            for(int i = 1; i < words.length; i++) {
                if(m.stringWidth(currentLine+words[i]) < lineWidth) {
                    currentLine += " "+words[i];
                } else {
                    g.drawString(currentLine, x, y);
                    y += m.getHeight();
                    currentLine = words[i];
                }
            }
            if(currentLine.trim().length() > 0) {
                g.drawString(currentLine, x, y);
            }
        }
    }

    /* 10% chance when someone picks a question for it to be double points */
    public void doublePoints() {
        Random rand = new Random();
        int min = 1;
        int max = 10;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        if (randomNum == 10) {
            game.DoublePointsButton.setVisible(true);
            selectedPoint += selectedPoint;
        }
    }

}
