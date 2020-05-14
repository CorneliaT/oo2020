interface Pieces {
    
    void start(char symbol);
    void getTurn();
    void place(char symbol, int pos);
    boolean checkPlacement(int pos);
    
}
