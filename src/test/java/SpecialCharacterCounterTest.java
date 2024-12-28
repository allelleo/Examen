import org.junit.jupiter.api.Test;
import ru.allelleo.SymbolFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialCharacterCounterTest {

    @Test
    public void testEmptyString() {
        String input = "";
        int result = SymbolFinder.countSpecialCharacters(input);
        assertEquals(0, result, "Пустая строка должна возвращать 0.");
    }

    @Test
    public void testNullString() {
        String input = null;
        int result = SymbolFinder.countSpecialCharacters(input);
        assertEquals(0, result, "null строка должна возвращать 0.");
    }

    @Test
    public void testStringWithoutSpecialCharacters() {
        String input = "HelloWorld123";
        int result = SymbolFinder.countSpecialCharacters(input);
        assertEquals(0, result, "Строка без спецсимволов должна возвращать 0.");
    }

    @Test
    public void testStringWithOnlySpecialCharacters() {
        String input = "!@#$%^&*()";
        int result = SymbolFinder.countSpecialCharacters(input);
        assertEquals(10, result, "Строка с 10 спецсимволами должна возвращать 10.");
    }

    @Test
    public void testStringWithMixedCharacters() {
        String input = "Hello, World! @2024 #Java";
        int result = SymbolFinder.countSpecialCharacters(input);
        assertEquals(4, result, "Строка должна возвращать количество спецсимволов, равное 5.");
    }
}
