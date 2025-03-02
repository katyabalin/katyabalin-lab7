import java.util.Random;

// defines TypeA which is a subclass of thing
public class TypeA extends Thing {
    
    // constructor sets up TypeA with a specific position and assigns label 'r'
    public TypeA(int row, int col) {
        super(row, col, 'r'); // calls the parent constructor with 'r' as the label
    }

    @Override
    // decides whether to turn based on a random number
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3); // picks a random number between 0 and 2
        if (i == 1) rightTurn(); // turns right if the number is 1
        if (i == 2) leftTurn();  // turns left if the number is 2
    }
}
