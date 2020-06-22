package encryption;

public class CaesarShiftEncoder extends CaesarShiftProcessor {
    public CaesarShiftEncoder(int number) {
        super(number);
    }

    @Override
    public char processChar(char c, int modifier) {
        var r = c + modifier;

        if (r > 'Z')
            r += 'A' - 'Z' - 1;

        return (char)r;
    }
}
