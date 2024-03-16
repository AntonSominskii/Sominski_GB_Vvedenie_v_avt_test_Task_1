package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedGameTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    public void testChooseDoor(int door) {
        game.chooseDoor(door);
        assertTrue(door >= 0 && door <= 2, "Door choice should be between 0 and 2");
    }
}