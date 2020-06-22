package encryption;

public abstract class RotorProcessor implements Processor {
    private final String rotor;

    public RotorProcessor(String rotor) {
        this.rotor = rotor;
    }

    protected String getRotor() {
        return this.rotor;
    }
}
