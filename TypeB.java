public class TypeB extends Thing {
    private int stepsSinceLast;

    public TypeB(int x, int y) {
        super(x, y, 'b');
        this.stepsSinceLast = 0;
    }

    @Override
    public void decideTurn() {
        stepsSinceLast++;
        if (stepsSinceLast == 10) {
            stepsSinceLast = 0;
            int choice = randomGen.nextInt(3);
            if (choice == 1) {
                rightTurn();
            } else if (choice == 2) {
                leftTurn();
            }
        }
    }
}
