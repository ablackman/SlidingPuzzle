package slidingpuzzle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Board extends JPanel{
    private Tile[][] tiles;
    private BufferedImage image;
    
    public Board(int rows, int cols, BufferedImage image) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLoweredBevelBorder());
        
        tiles = new Tile[rows][cols];
        this.image = image;
        
        int imageW = image.getWidth();
        int imageH = image.getHeight();
        
        Dimension d = new Dimension(imageW, imageH);
        setPreferredSize(d);
        setMaximumSize(d);
        setMinimumSize(d);
        
        int tileW = imageW / rows;
        int tileH = imageH / cols; 
        for(int y = 0; y < tiles.length; y++) {
            for(int x = 0; x < tiles[0].length; x++) {
                int tileX = x * tileW;
                int tileY = y * tileH;
                tiles[x][y] = new Tile(y * rows + x, tileX, tileY, image.getSubimage(tileX, tileY, tileW, tileH));
            }
        }
        tiles[rows - 1][cols - 1] = null;
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            	
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int x = 0; x < tiles.length; x++) {
            for(int y = 0; y < tiles[0].length; y++) {
                Tile tile = tiles[x][y];
                if(tile != null) {
                    g.drawImage(tile.getImage(), tile.getX(), tile.getY(), null);
                }
            }
        }
    }
}
