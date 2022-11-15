import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

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


    //private int mouseX, mouseY;

    private boolean isMainScreen = false;

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
                category11Button.setVisible(true);
                category12Button.setVisible(true);
                category13Button.setVisible(true);
                category14Button.setVisible(true);
                category15Button.setVisible(true);
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

// setting quiz buttons
        category11Button.setVisible(false);
        category11Button.setBounds(95,112,180,100);
        category11Button.setBorderPainted(false);
        category11Button.setContentAreaFilled(false);
        category11Button.setFocusPainted(false);
        category11Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                category11Button.setIcon(quiz100EnteredImage);
                category11Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                category11Button.setIcon(quiz100BasicImage);
                category11Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(category11Button);

        category12Button.setVisible(false);
        category12Button.setBounds(95,214,180,100);
        category12Button.setBorderPainted(false);
        category12Button.setContentAreaFilled(false);
        category12Button.setFocusPainted(false);
        category12Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                category12Button.setIcon(quiz200EnteredImage);
                category12Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                category12Button.setIcon(quiz200BasicImage);
                category12Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(category12Button);

        category13Button.setVisible(false);
        category13Button.setBounds(95,316,180,100);
        category13Button.setBorderPainted(false);
        category13Button.setContentAreaFilled(false);
        category13Button.setFocusPainted(false);
        category13Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                category13Button.setIcon(quiz300EnteredImage);
                category13Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                category13Button.setIcon(quiz300BasicImage);
                category13Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(category13Button);

        category14Button.setVisible(false);
        category14Button.setBounds(95,418,180,100);
        category14Button.setBorderPainted(false);
        category14Button.setContentAreaFilled(false);
        category14Button.setFocusPainted(false);
        category14Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                category14Button.setIcon(quiz400EnteredImage);
                category14Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                category14Button.setIcon(quiz400BasicImage);
                category14Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(category14Button);

        category15Button.setVisible(false);
        category15Button.setBounds(95,520,180,100);
        category15Button.setBorderPainted(false);
        category15Button.setContentAreaFilled(false);
        category15Button.setFocusPainted(false);
        category15Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                category15Button.setIcon(quiz500EnteredImage);
                category15Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                category15Button.setIcon(quiz500BasicImage);
                category15Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(category15Button);

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
            g.drawImage(category1Image,  95, 10, null);
            g.drawImage(category2Image,  277, 10, null);
            g.drawImage(category3Image,  459, 10, null);
            g.drawImage(category4Image,  641, 10, null);
            g.drawImage(category5Image,  823, 10, null);
            g.drawImage(category6Image,  1005, 10, null);
        }
        paintComponents(g);
        this.repaint();
    }

}


