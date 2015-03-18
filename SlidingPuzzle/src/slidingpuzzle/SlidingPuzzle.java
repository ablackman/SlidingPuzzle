package slidingpuzzle;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JButton;

public class SlidingPuzzle extends JApplet{
    Board board;
    JButton resetButton;
    
    @Override
    public void init() {
        setLayout(new FlowLayout());
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new URL(getCodeBase(), "slidingpuzzle/GithubLogo.png"));
        } catch (IOException e) {
        }
        
        board = new Board(3, 3, img);
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                
            }
        });
        
        add(board);
    }
}
