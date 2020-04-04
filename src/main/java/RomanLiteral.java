public enum RomanLiteral {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40);

    private int value;

    RomanLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
