package s01_04.n1ejercicio3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayHandlerTest {
    @Test
    public void testArray() {
        int[] array = {1, 2, 3};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayHandler handler = new ArrayHandler();
            handler.getElementAtIndex(array, 3);
        });
    }
}