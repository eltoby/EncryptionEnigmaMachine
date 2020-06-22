package encryption;

public class RotorDecoder extends RotorProcessor {
    public RotorDecoder(String rotor) {
        super(rotor);
    }

    @Override
    public String process(String message) {
        var stb = new StringBuilder();
        for(var i = 0; i < message.length(); i++) {
            var c = message.charAt(i);
            var pos = this.getRotor().indexOf(c);
            var r = (char)('A' + pos);
            stb.append(r);
        }

        return stb.toString();
    }
}
