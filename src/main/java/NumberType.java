public enum NumberType {
    TWO(0),
    THREE(1),
    FOUR(2),
    FIVE(3),
    SIX(4),
    SEVEN(5),
    EIGHT(6),
    NINE(7),
    TEN(8),
    JACK(9),
    QUEEN(10),
    KING(11),
    ACE(12);

    private final int rank;

    NumberType(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }

}
