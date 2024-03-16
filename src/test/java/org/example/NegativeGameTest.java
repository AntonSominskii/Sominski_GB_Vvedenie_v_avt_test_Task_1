package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeGameTest extends BaseTest {

    @Test
    public void testChooseInvalidDoor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.chooseDoor(3), "Choosing a door " +
                "outside of the valid range should throw an exception");
    }
}