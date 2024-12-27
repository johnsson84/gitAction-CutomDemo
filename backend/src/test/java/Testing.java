import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void testAddition() {
        int result = Calculate.add(25, 75);

        assertEquals(100, result, "result is not 100");
    }
}
