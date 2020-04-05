import java.util.List;

class Arabic2Roman {

    String convert(int arabic) {
        throwExceptionWhenNumberIsNotInRange(arabic);

        List<RomanLiteral> romanLiterals = RomanLiteral.getAll;

        String rom = "";
        int index = romanLiterals.size() - 1;
        while (arabic > 0 && index >= 0) {
            RomanLiteral current = romanLiterals.get(index);

            if (current.getValue() <= arabic) {
                rom = rom.concat(current.toString());
                arabic -= current.getValue();
            } else {
                index--;
            }
        }
        return rom;
    }

    private void throwExceptionWhenNumberIsNotInRange(int arabic) {
        if (arabic < 1 || arabic > 3000)
            throw new IllegalArgumentException(arabic + " is not in range!!");
    }
}
