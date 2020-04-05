import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanLiteral {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    private int value;

    RomanLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static List<RomanLiteral> getAll = Arrays
            .stream(RomanLiteral.values())
            .collect(Collectors.toList());
}
