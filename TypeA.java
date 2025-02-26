class TypeA extends Entity {
    public TypeA(int x, int y) {
        super(x, y, 'r');
    }
    
    @Override
    public void decideTurn() {
        int choice = randomGen.nextInt(3);
        if (choice == 1) turnRight();
        if (choice == 2) turnLeft();
    }
}
