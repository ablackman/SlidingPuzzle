package slidingpuzzle;

import java.awt.FlowLayout;
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
        try {
            board = new Board(5, 3, ImageIO.read(new URL(getCodeBase(), "eclipse-logo.png")));
        } catch (IOException e) {
        }
        System.out.println(getCodeBase());
        
        add(board);
    }
}
