package slidingpuzzle;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	private final int ID;
	private int position;
	
    private BufferedImage image;
    private int x;
    private int y;
    private int targetX;
    private int targetY;
    
    public Tile(int ID, int x, int y, BufferedImage image) {
    	this.ID = ID;
    	this.position = ID;
        this.x = x;
        this.y = y;
        this.image = image;
    }
    
    public void setTarget(int x, int y) {
        targetX = x;
        targetY = y;
    }
    
    public int getID() {
    	return ID;
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
    
    public void setPosition(int pos) {
    	position = pos;
    }
}
