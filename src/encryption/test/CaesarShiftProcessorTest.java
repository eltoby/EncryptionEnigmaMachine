package encryption.test;

import encryption.CaesarShiftDecoder;
import encryption.CaesarShiftEncoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftProcessorTest {

    @Test
    void encode() {
        var sut = new CaesarShiftEncoder(4);
        assertEquals("EFG", sut.process("AAA"));
    }

    @Test
    void decode() {
        var sut = new CaesarShiftDecoder(4);
        assertEquals("AAA", sut.process("EFG"));
    }
}