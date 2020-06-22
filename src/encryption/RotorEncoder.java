package encryption;

public class RotorEncoder extends RotorProcessor {
    public RotorEncoder(String rotor) {
        super(rotor);
    }

    @Override
    public String process(String message) {
        var stb = new StringBuilder();

        for (var i = 0; i < message.length(); i++) {
            var c = message.charAt(i);
            var pos = c - 'A';
            stb.append(this.getRotor().charAt(pos));
        }

        return stb.toString();
    }
}
