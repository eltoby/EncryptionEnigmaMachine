package encryption.test;

import encryption.RotorDecoder;
import encryption.RotorEncoder;
import encryption.RotorProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotorProcessorTest {

    @Test
    void encode() {
        var sut = new RotorEncoder("BDFHJLCPRTXVZNYEIWGAKMUSQO");
        assertEquals("JLC", sut.process("EFG"));
    }

    @Test
    void decode() {
        var sut = new RotorDecoder("BDFHJLCPRTXVZNYEIWGAKMUSQO");
        assertEquals("EFG", sut.process("JLC"));
    }
}