package encryption;

public abstract class CaesarShiftProcessor implements Processor {
    private final int number;

    public CaesarShiftProcessor(int number){
        this.number = number;
    }

    public String process(String message){
        var stb = new StringBuilder();

        for (var i = 0; i < message.length(); i++)
        {
            var mod = (this.number + i) % 26;
            var c = message.charAt(i);
            char r = this.processChar(c, mod);
            stb.append(r);
        }

        return stb.toString();
    }

    protected abstract char processChar(char c, int modifier);
}
