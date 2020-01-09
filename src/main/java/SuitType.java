public enum SuitType {

    HEARTS(3),
    DIAMONDS(1),
    SPADES(4),
    CLUBS(2);

    private final int value;

    private SuitType(int value) {
        this.value = value;
    }

    public int getSuitValue() {
        return this.value;
    }
}