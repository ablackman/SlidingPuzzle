package slidingpuzzle;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
    private BufferedImage image;
    private int x;
    private int y;
    private int targetX;
    private int targetY;
    
    public Tile(int x, int y, BufferedImage image) {
        this.x = x;
        this.y = y;
        this.image = image;
    }
    
    public void drawTile(Graphics g) {
        g.drawImage(image,  x,  y,  null);
    }
    
    public void setTarget(int x, int y) {
        targetX = x;
        targetY = y;
    }
    
    public BufferedImage getImage() {
        return image;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
