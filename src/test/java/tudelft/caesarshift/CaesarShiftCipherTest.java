package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void testEncrypt_ShiftPositive() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void testEncrypt_ShiftWrapAround() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void testEncrypt_ShiftNegative() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("ebiil", cipher.CaesarShiftCipher("hello", -3));
    }

    @Test
    public void testEncrypt_ShiftWithSpacesOrSymbols() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("hello world!", 3));
    }

    @Test
    public void testEncrypt_ShiftWithUppercase() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("Hello", 3));
    }

    @Test
    public void testEncrypt_ShiftWithZero() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("abc", cipher.CaesarShiftCipher("abc", 0));
    }

    @Test
    public void testEncrypt_ShiftWithLargeValue() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("bcd", cipher.CaesarShiftCipher("abc", 27)); // 27 es equivalente a un desplazamiento de 1
    }
}
