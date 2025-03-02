import java.util.Random;

public abstract class Thing {
    // stores the row position of the object
    protected int row;  
    // stores the column position of the object
    protected int col;
    // represents the movement direction
    protected int dir;
    // character label identifying the object
    protected char lab;
    // random generator used for movement decisions
    protected Random rand; 

    // initializes a thing object with position and label
    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0; // sets the initial direction to 0
        this.rand = new Random();  // creates a new random instance for each object
    }

    // moves the object forward based on its direction
    public void step() {
        final int[] dr = {1, 0, -1, 0}; // row movement changes for different directions
        final int[] dc = {0, 1, 0, -1}; // column movement changes for different directions
        row += dr[dir]; // updates the row coordinate
        col += dc[dir]; // updates the column coordinate
    }

    // rotates the object 90 degrees to the right
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    // rotates the object 90 degrees to the left
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    // abstract method to determine if the object should turn, implemented in subclasses
    public abstract void maybeTurn(Random rand);

    // returns a string with the object's position and label
    public String toString() {
        return row + " " + col + " " + lab;
    }
}
