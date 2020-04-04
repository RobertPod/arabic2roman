import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arabic2Roman {


    public String convert(int arabic) {
        if (arabic < 1 || arabic > 3000)
            throw (new IllegalArgumentException());


        List<RomanLiteral> romanLiteralReversed = Arrays
                .stream(RomanLiteral.values())
                .sorted(Comparator.comparing(RomanLiteral::getValue).reversed())
                .collect(Collectors.toList());

        String rom = "";
        int index = 0;
        while (arabic > 0 && index < romanLiteralReversed.size()) {
            RomanLiteral current = romanLiteralReversed.get(index);

            if (current.getValue() <= arabic) {
                rom = rom.concat(current.toString());
                arabic -= current.getValue();
            } else {
                index++;
            }
        }
        return rom;
    }
}
