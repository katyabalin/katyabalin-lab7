import java.util.Random;

public abstract class Thing {
    protected int x;
    protected int y;
    protected int direction;
    protected char label;
    protected Random randomGen;
    
    public Thing(int x, int y, char label) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.direction = 0; 
        this.randomGen = new Random();
    }
    
    public void rightTurn() {
        this.direction = (this.direction + 1) % 4;
    }
    
    public void leftTurn() {
        this.direction = (this.direction + 3) % 4;
    }
    
    public void step() {
        final int[] deltaX = {1, 0, -1, 0};
        final int[] deltaY = {0, 1, 0, -1};
        this.x += deltaX[this.direction];
        this.y += deltaY[this.direction];
    }
    
    public abstract void decideTurn();
    
    @Override
    public String toString() {
        return x + " " + y + " " + label;
    }
}
