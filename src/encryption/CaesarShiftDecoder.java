package encryption;

public class CaesarShiftDecoder extends CaesarShiftProcessor {
    public CaesarShiftDecoder(int number) {
        super(number);
    }

    @Override
    protected char processChar(char c, int modifier) {
        var r = c - modifier;

        if (r < 'A')
            r += 'Z' - 'A' + 1;

        return (char)r;
    }
}
